package com.sockets.web.data

import kotlinx.coroutines.runBlocking
import org.bson.conversions.Bson
import org.litote.kmongo.reactivestreams.*  //NEEDED! import KMongo reactivestreams extensions
import org.litote.kmongo.coroutine.*
import org.litote.kmongo.eq
import org.litote.kmongo.reactivestreams.KMongo

class P2PImpl(
    db: CoroutineDatabase
) : P2PDataSource {

    private val databaseCollection = db.getCollection<P2PMessage>("P2PMessage")
    private val locationCollection = db.getCollection<LocationMessage>("LocationMessage")

    override suspend fun getAllMessages(from: String?, to: String?): List<P2PMessage> {

        return databaseCollection.find(
            filters = arrayOf(
                P2PMessage::from eq from,
                P2PMessage::to eq to
            )
        ).descendingSort(P2PMessage::timeStamp).toList()
    }

    override suspend fun getLocationMessage(from: String?): List<LocationMessage>? {

       return locationCollection.find("{from:$from}").toList()
    }

    override suspend fun insertMessages(message: P2PMessage) {

        databaseCollection.insertOne(message)
    }

    override suspend fun insertLocation(location: LocationMessage) {
        locationCollection.insertOne(
            location
        )
    }


}

