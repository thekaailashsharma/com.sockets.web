package com.sockets.web.plugins

import com.sockets.web.data.Target
import com.sockets.web.data.applinks
import com.sockets.web.data.applinksItem
import com.sockets.web.roomController.P2PController
import com.sockets.web.roomController.RoomController
import com.sockets.web.routes.chatRoutes
import com.sockets.web.routes.getMessages
import com.sockets.web.routes.getP2PMessages
import com.sockets.web.routes.infoRoutes
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {

    val roomController by inject<RoomController>()
    val p2pController by inject<P2PController>()


    routing {
        get("/") {
            call.respond("Hello")
        }
        chatRoutes(roomController = roomController)
        getMessages(roomController = roomController)
        infoRoutes(roomController = p2pController)
        getP2PMessages(roomController = p2pController)
    }
}
