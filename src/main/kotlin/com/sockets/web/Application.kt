package com.sockets.web

import io.ktor.server.application.*
import com.sockets.web.plugins.*
import org.koin.ktor.plugin.Koin
/**
 * The application module.
 * @author https://github.com/thekaailashsharma
 */
/**
 * The main application entry point.
 *
 * @param args the command-line arguments.
 */
@Suppress("unused")
fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    /**
     * Installs the Koin dependency injection framework and configures the modules.
     */
    install(Koin){
        modules(com.sockets.web.di.module)
    }
    configureSockets()
    configureSecurity()
    configureMonitoring()
    configureSerialization()
    configureRouting()
}

/**
 * Represents the MongoDB configuration.
 *
 * @param value the MongoDB connection URL.
 */
sealed class MongoDB(val value: String){
    /**
     * The URL for connecting to MongoDB.
     */
    object url: MongoDB("mongodb://mongo:fpk4FwbSnprEMAFvyKif@containers-us-west-109.railway.app:6235")
}
