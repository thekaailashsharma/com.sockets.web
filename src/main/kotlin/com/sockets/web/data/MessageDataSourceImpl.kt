package com.sockets.web.data

import org.litote.kmongo.coroutine.CoroutineDatabase

class MessageDataSourceImpl(
    private val db: CoroutineDatabase
): DataSource {

    private val databaseCollection = db.getCollection<Message>("chatApp")

    override suspend fun getAllMessages(from: String?): List<Message> {
        return databaseCollection.find("{from:$from}")
            .descendingSort(Message::timeStamp)
            .toList()
    }

    override suspend fun insertMessages(message: Message) {
        databaseCollection.insertOne(message)
    }
}