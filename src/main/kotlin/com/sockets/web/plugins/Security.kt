package com.sockets.web.plugins

import com.sockets.web.data.UserInfo
import com.sockets.web.sessions.ChatSession
import com.sockets.web.sessions.P2PSession
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.sessions.*
import io.ktor.util.*
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

fun Application.configureSecurity() {
    install(Sessions) {
        cookie<ChatSession>("ChatSession")
        cookie<P2PSession>("P2PSession")
    }

    intercept(ApplicationCallPipeline.Plugins) {
        if (call.sessions.get<ChatSession>() == null) {
            val userName = call.parameters["userName"] ?: ""
            call.sessions.set(
                ChatSession(
                    userName = userName,
                    sessionId = generateNonce()
                )
            )
        }
        if (call.sessions.get<P2PSession>() == null) {
            val from = call.parameters["from"] ?: ""
            val to = call.parameters["to"] ?: ""
            val latitude = call.parameters["latitude"]
            val longitude = call.parameters["longitude"]
//            if (fromValidation(from)) {
                call.sessions.set(
                    P2PSession(
                        from = from,
                        to = to,
                        latitude = latitude,
                        longitude = longitude,
                        sessionId = generateNonce()
                    )
                )
//            } else {
//                call.respond(message = "Error Checks Failed !!!", status = HttpStatusCode.Forbidden)
//            }
        }


    }

}


suspend fun fromValidation(from: String): Boolean {
    val db = KMongo.createClient().coroutine.getDatabase("TryChatting")
    val list = db.getCollection<UserInfo>("chatApp").find().toList()
    list.forEach {
        if (it.userName == from) return true
    }
    return false

}

suspend fun toValidation(to: String): Boolean {
    val db = KMongo.createClient().coroutine.getDatabase("TryChatting")
    val list = db.getCollection<UserInfo>("chatApp").find().toList()
    list.forEach {
        if (it.userName == to) return true
    }
    return false

}
