package com.sockets.web.di

import com.sockets.web.MongoDB
import com.sockets.web.data.DataSource
import com.sockets.web.data.MessageDataSourceImpl
import com.sockets.web.data.P2PDataSource
import com.sockets.web.data.P2PImpl
import com.sockets.web.roomController.P2PController
import com.sockets.web.roomController.RoomController
import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

/**
 * Koin module for dependency injection configuration.
 */
val module = module {
    /**
     * Provides a single instance of the CoroutineDatabase representing the MongoDB client.
     */
    single {
        KMongo.createClient(MongoDB.url.value).coroutine.getDatabase("TryChatting")
    }
    /**
     * Provides a single instance of the [DataSource] implementation, [MessageDataSourceImpl].
     */
    single<DataSource> {
        MessageDataSourceImpl(get())
    }
    /**
     * Provides a single instance of the [P2PDataSource] implementation, [P2PImpl].
     */
    single<P2PDataSource> {
        P2PImpl(get())
    }
    /**
     * Provides a single instance of the [RoomController].
     */
    single {
        RoomController(get())
    }
    /**
     * Provides a single instance of the [P2PController].
     */
    single {
        P2PController(get())
    }

}