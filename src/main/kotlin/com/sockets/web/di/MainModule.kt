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

val module = module {
    single {
        KMongo.createClient(MongoDB.url.value).coroutine.getDatabase("TryChatting")
    }
    single<DataSource> {
        MessageDataSourceImpl(get())
    }

    single<P2PDataSource> {
        P2PImpl(get())
    }

    single {
        RoomController(get())
    }

    single {
        P2PController(get())
    }

}