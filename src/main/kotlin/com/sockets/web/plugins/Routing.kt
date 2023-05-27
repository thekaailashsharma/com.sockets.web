package com.sockets.web.plugins

import com.sockets.web.roomController.P2PController
import com.sockets.web.roomController.RoomController
import com.sockets.web.routes.chatRoutes
import com.sockets.web.routes.getMessages
import com.sockets.web.routes.getP2PMessages
import com.sockets.web.routes.infoRoutes
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import org.koin.ktor.ext.inject

/**
 * Configures the routing for the application.
 */
fun Application.configureRouting() {

    val roomController by inject<RoomController>()
    val p2pController by inject<P2PController>()

    /**
     * Defines the routing configuration for the application.
     */
    routing {
        /**
         * Defines a GET route for the root path ("/") that responds with "Hello".
         */
        get("/") {
            call.respond("Hello")
        }

        chatRoutes(roomController = roomController)
        getMessages(roomController = roomController)
        infoRoutes(roomController = p2pController)
        getP2PMessages(roomController = p2pController)
    }
}
