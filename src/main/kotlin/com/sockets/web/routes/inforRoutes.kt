package com.sockets.web.routes

import com.sockets.web.MongoDB
import com.sockets.web.data.Failure
import com.sockets.web.data.Success
import com.sockets.web.data.UserInfo
import com.sockets.web.roomController.P2PController
import com.sockets.web.sessions.P2PSession
import com.sockets.web.utilities.getRandomString
import io.ktor.http.*
import io.ktor.http.content.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.sessions.*
import io.ktor.server.websocket.*
import io.ktor.websocket.*
import kotlinx.coroutines.channels.consumeEach
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo
import java.io.File


fun Routing.infoRoutes(roomController: P2PController) {
    get("/users") {
        val from = call.parameters["from"]
        if (from == null) {
            call.respond(
                status = HttpStatusCode.BadRequest, message = Failure(
                    failure = "Please enter from Username", result = "From Username is required"
                )
            )
            return@get
        }
        val db = KMongo.createClient(MongoDB.url.value).coroutine.getDatabase("TryChatting")
        val k = db.getCollection<UserInfo>("chatApp").find().toList()
        call.respond(status = HttpStatusCode.OK, message = k)

    }
    get("/profile") {
        val username = call.parameters["username"]
        var path: String? = null
        if (username != null) {
            val db = KMongo.createClient(MongoDB.url.value).coroutine.getDatabase("TryChatting")
            val k = db.getCollection<UserInfo>("chatApp").find().toList()
            for (i in k) {
                if (i.userName == username) {
                    path = i.profile
                }
            }
            if (path != null) {
                val file = File(path)
                call.response.header(
                    HttpHeaders.ContentDisposition, ContentDisposition.Inline.withParameter(
                        ContentDisposition.Parameters.FileName, "image.jpg"
                    ).toString()
                )
                call.respondFile(file)
            } else {
                call.respond(
                    Failure(
                        result = "Username Invalid"
                    )
                )
            }

        } else {
            call.respond(
                Failure(
                    result = "Please Enter a Username"
                )
            )
        }


    }
    put("/users") {
        val multipart = call.receiveMultipart()
        val db = KMongo.createClient(MongoDB.url.value).coroutine.getDatabase("TryChatting")
        val collection = db.getCollection<UserInfo>("chatApp")
        var username = ""
        var email = ""
        var path: String? = null
        var name = ""

        multipart.forEachPart { part ->
            if (part is PartData.FileItem) {
                when (part.name?.lowercase()) {
                    "profile" -> {
                        path = "src/main/resources/profiles/${getRandomString()}.${part.originalFileName?.substringAfter(".")}"
                        val file = path?.let { it1 -> File(it1) }
                        part.streamProvider().use { inputStream ->
                            file?.outputStream()?.buffered().use {
                                if (it != null) {
                                    inputStream.copyTo(it)
                                }
                            }
                        }
                    }

                }
            }

            if (part is PartData.FormItem) {
                println("Part Name is ${part.name}")
                when (part.name?.lowercase()) {
                    "username" -> {
                        username = part.value
                    }

                    "email" -> {
                        email = part.value
                    }

                    "name" -> {
                        name = part.value
                    }

                }

            }

        }
        if (name != "" && email != "" && username != "") {
            println("Name = $name, email = $email, username = $username")
            try {
                collection.insertOne(
                    UserInfo(
                        name = name, email = email, profile = path, userName = username
                    )
                )
                call.respond(
                    Success(
                        result = "User Created Successfully",
                        data = UserInfo(
                            name = name, email = email, profile = path, userName = username
                        )
                    )
                )
            } catch (e: com.mongodb.MongoWriteException) {
                if (e.message?.contains("duplicate key error collection") == true) {
                    call.respond(status = HttpStatusCode.BadRequest, "UserName Already Exists. Should be Unique")
                } else {
                    call.respond(status = HttpStatusCode.BadRequest, e.message.toString())
                }
            } catch (e: Exception) {
                call.respond(status = HttpStatusCode.BadRequest, e.message.toString())
            }
        } else {
            call.respond(status = HttpStatusCode.BadRequest, "Looks Some Parameter is Missing")
        }
    }

    webSocket("/p2p") {
        val session = call.sessions.get<P2PSession>()
        if (session == null) {
            close(CloseReason(CloseReason.Codes.VIOLATED_POLICY, "Null Session"))
        }
        try {
            session?.let {
                roomController.onJoin(
                    from = it.from, to = it.to, sessionId = session.sessionId, socket = this
                )

                incoming.consumeEach { frame ->
                    if (frame is Frame.Text) {
                        println("latitude = ${session.latitude} & longitude = ${session.longitude}")
                        if (!frame.readText().contains("latitude=#")) {
                            roomController.sendMessage(
                                fromUserName = session.from, message = frame.readText(), toUserName = session.to
                            )
                        } else {
                            println("OK Location")
                            roomController.sendMessage(
                                latitude = frame.readText().substringAfter("latitude=#"),
                                longitude = frame.readText().substringAfter("longitude=#"),
                                fromUserName = session.from,
                                toUserName = session.to
                            )
                        }
                    }
                }
            }

        } catch (e: Exception) {
            call.respond(status = HttpStatusCode.BadGateway, message = e.printStackTrace())
        } finally {
            roomController.disconnect(session?.from ?: "Guest")
        }
    }
}

fun Routing.getP2PMessages(roomController: P2PController) {
    get("/Messages") {
        val get = roomController.getLocationMessage() ?: emptyList()
        call.respond(HttpStatusCode.OK, get)
    }
}
