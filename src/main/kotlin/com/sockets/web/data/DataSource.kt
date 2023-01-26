package com.sockets.web.data

interface DataSource {

    suspend fun getAllMessages(): List<Message>

    suspend fun insertMessages(message: Message)
}

interface P2PDataSource{

    suspend fun getAllMessages(from: String?, to: String?): List<P2PMessage>?

    suspend fun getLocationMessage(): List<LocationMessage>?

    suspend fun insertMessages(message: P2PMessage)

    suspend fun insertLocation(location: LocationMessage)

}