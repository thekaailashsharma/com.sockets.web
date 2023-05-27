package com.sockets.web.data

import org.litote.kmongo.coroutine.CoroutineDatabase

/**
 * Implementation of the [DataSource] interface for handling messages.
 *
 * @param db the CoroutineDatabase instance representing the database.
 */
class MessageDataSourceImpl(
    private val db: CoroutineDatabase
): DataSource {


    private val databaseCollection = db.getCollection<Message>("chatApp")

    /**
     * Retrieves all messages from the data source.
     *
     * @param from optional filter to retrieve messages from a specific sender.
     * @return a list of messages.
     */
    override suspend fun getAllMessages(from: String?): List<Message> {
        return databaseCollection.find("{from:$from}")
            .descendingSort(Message::timeStamp)
            .toList()
    }

    /**
     * Inserts a new message into the data source.
     *
     * @param message the message to insert.
     */
    override suspend fun insertMessages(message: Message) {
        databaseCollection.insertOne(message)
    }
}