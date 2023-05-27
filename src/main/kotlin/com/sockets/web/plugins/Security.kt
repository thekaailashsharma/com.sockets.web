package com.sockets.web.plugins

import com.sockets.web.MongoDB
import com.sockets.web.data.UserInfo
import com.sockets.web.sessions.ChatSession
import com.sockets.web.sessions.P2PSession
import io.ktor.server.application.*
import io.ktor.server.sessions.*
import io.ktor.util.*
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

/**
 * Configures the security settings for the application.
 */
fun Application.configureSecurity() {
    /**
     * Installs sessions for the application, configuring the cookies used for ChatSession and P2PSession.
     */
    install(Sessions) {
        cookie<ChatSession>("ChatSession")
        cookie<P2PSession>("P2PSession")
    }
    /**
     * Intercepts the call pipeline to check and set ChatSession and P2PSession if they are not present.
     */
    intercept(ApplicationCallPipeline.Plugins) {
        /**
         * Sets the ChatSession if it is not already present in the call's sessions.
         */
        if (call.sessions.get<ChatSession>() == null) {
            val userName = call.parameters["userName"] ?: ""
            call.sessions.set(
                ChatSession(
                    userName = userName,
                    sessionId = generateNonce()
                )
            )
        }
        /**
         * Sets the P2PSession if it is not already present in the call's sessions.
         */
        if (call.sessions.get<P2PSession>() == null) {
            val from = call.parameters["from"] ?: ""
            val to = call.parameters["to"] ?: ""
            val latitude = call.parameters["latitude"]
            val longitude = call.parameters["longitude"]
            call.sessions.set(
                P2PSession(
                    from = from,
                    to = to,
                    latitude = latitude,
                    longitude = longitude,
                    sessionId = generateNonce()
                )
            )
        }

    }

}

