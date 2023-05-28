package com.sockets.web.plugins

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import io.ktor.server.routing.*

/**
 * Configures the serialization settings for the application.
 */
fun Application.configureSerialization() {
    /**
     * Installs content negotiation for the application, enabling JSON serialization.
     */
    install(ContentNegotiation) {
        json()
    }
}
