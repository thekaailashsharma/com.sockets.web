package com.sockets.web

import io.ktor.server.application.*
import com.sockets.web.plugins.*
import org.koin.ktor.plugin.Koin

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    install(Koin){
        modules(com.sockets.web.di.module)
    }
    configureSockets()
    configureSecurity()
    configureMonitoring()
    configureSerialization()
    configureRouting()
}
