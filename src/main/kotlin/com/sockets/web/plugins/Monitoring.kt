package com.sockets.web.plugins

import io.ktor.server.plugins.callloging.*
import org.slf4j.event.*
import io.ktor.server.request.*
import io.ktor.server.application.*
import io.ktor.server.response.*

/**
 * Configures monitoring and call logging for the application.
 */
fun Application.configureMonitoring() {
    /**
     * Installs the CallLogging plugin with the specified configuration.
     */
    install(CallLogging) {
        level = Level.INFO
        filter { call -> call.request.path().startsWith("/") }
    }

}
