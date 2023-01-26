package com.sockets.web.data

import org.litote.kmongo.coroutine.CoroutineDatabase

class MessageDataSourceImpl(
    private val db: CoroutineDatabase
): DataSource {

    private val databaseCollection = db.getCollection<Message>("chatApp")

    override suspend fun getAllMessages(): List<Message> {
        return databaseCollection.find()
            .descendingSort(Message::timeStamp)
            .toList()
    }

    override suspend fun insertMessages(message: Message) {
        databaseCollection.insertOne(message)
    }
}