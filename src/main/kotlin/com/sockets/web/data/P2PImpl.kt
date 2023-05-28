package com.sockets.web.data

import org.litote.kmongo.coroutine.*
import org.litote.kmongo.eq

/**
 * Implementation of the [P2PDataSource] interface for handling peer-to-peer messages and location information.
 *
 * @param db the CoroutineDatabase instance representing the database.
 */
class P2PImpl(
    db: CoroutineDatabase
) : P2PDataSource {

    private val databaseCollection = db.getCollection<P2PMessage>("P2PMessage")
    private val locationCollection = db.getCollection<LocationMessage>("LocationMessage")

    /**
     * Retrieves all P2P messages from the data source.
     *
     * @param from optional filter to retrieve messages from a specific sender.
     * @param to optional filter to retrieve messages for a specific recipient.
     * @return a list of P2P messages.
     */
    override suspend fun getAllMessages(from: String?, to: String?): List<P2PMessage> {

        return databaseCollection.find(
            filters = arrayOf(
                P2PMessage::from eq from,
                P2PMessage::to eq to
            )
        ).descendingSort(P2PMessage::timeStamp).toList()
    }

    /**
     * Retrieves all location messages from the data source.
     *
     * @param from optional filter to retrieve location messages from a specific sender.
     * @return a list of location messages.
     */
    override suspend fun getLocationMessage(from: String?): List<LocationMessage>? {

       return locationCollection.find("{from:$from}").toList()
    }

    /**
     * Inserts a new P2P message into the data source.
     *
     * @param message the P2P message to insert.
     */
    override suspend fun insertMessages(message: P2PMessage) {

        databaseCollection.insertOne(message)
    }

    /**
     * Inserts a new location message into the data source.
     *
     * @param location the location message to insert.
     */
    override suspend fun insertLocation(location: LocationMessage) {
        locationCollection.insertOne(
            location
        )
    }


}

