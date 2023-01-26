package com.sockets.web.routes

import com.sockets.web.roomController.RoomController
import com.sockets.web.sessions.ChatSession
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.sessions.*
import io.ktor.server.websocket.*
import io.ktor.websocket.*
import kotlinx.coroutines.channels.consumeEach

fun Routing.chatRoutes(roomController: RoomController) {
    webSocket("/chat") {
        val session = call.sessions.get<ChatSession>()

        if (session == null) {
            close(CloseReason(CloseReason.Codes.VIOLATED_POLICY, "Null Session"))
        }
        try {
            session?.let {
                roomController.onJoin(
                    username = it.userName,
                    sessionId = session.sessionId,
                    socket = this
                )
                incoming.consumeEach { frame ->
                    if (frame is Frame.Text) {

                        roomController.sendMessage(
                            senderUsername = session.userName,
                            message = frame.readText()
                        )

                    }
                }
            }
        } catch (e: Exception) {
            call.respond(status = HttpStatusCode.BadGateway, message = e.printStackTrace())
        } finally {
            roomController.disconnect(session?.userName ?: "Guest")
        }

    }
}

fun Routing.getMessages(roomController: RoomController) {
    get("/Messages1") {
        call.respond(HttpStatusCode.OK, roomController.getAllMessages())
    }
}
