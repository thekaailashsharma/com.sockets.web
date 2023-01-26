package com.sockets.web.roomController

import com.sockets.web.data.*
import io.ktor.websocket.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.util.concurrent.ConcurrentHashMap


class P2PController(
    private val dataSource: P2PDataSource
) {
    private val members = ConcurrentHashMap<String, P2PMember>()
    private val location = ConcurrentHashMap<String, LocationMember>()

    fun onJoin(
        from: String?,
        to: String?,
        sessionId: String,
        socket: WebSocketSession
    ) {
        if (members.contains(from)) {
            throw Exception("Member Already Exists !!")
        }
        members[from ?: ""] = P2PMember(
            from = from,
            to = to,
            sessionId = sessionId,
            socket = socket
        )
    }

//    suspend fun sendLocation(
//        latitude: String?,
//        longitude: String?
//    ) {
//        location.values.forEach { locationMember ->
//            val locationEntity = LocationMessage(
//                latitude = latitude,
//                longitude = longitude
//            )
//            dataSource.insertLocation(locationEntity)
//            val parsedMessage = Json.encodeToString(location)
//            locationMember.socket.send(Frame.Text(parsedMessage))
//
//        }
//    }

    suspend fun sendMessage(
        fromUserName: String,
        toUserName: String,
        message: String = "",
        latitude: String? = null,
        longitude: String? = null
    ) {
        if (latitude != null) {
            members.values.forEach { member ->
                val messageEntity = LocationMessage(
                    latitude = latitude.substringAfter("latitude=#").substringBefore("#latitude"),
                    longitude = longitude?.substringAfter("longitude=#")?.substringBefore("#longitude"),
                    from = fromUserName,
                    to = toUserName
                )
                dataSource.insertLocation(messageEntity)
                val parsedMessage = Json.encodeToString(messageEntity)
                member.socket.send(Frame.Text(parsedMessage))
            }
        } else {
            members.values.forEach { member ->
                val messageEntity = P2PMessage(
                    from = fromUserName,
                    text = message,
                    timeStamp = System.currentTimeMillis(),
                    to = toUserName
                )
                dataSource.insertMessages(messageEntity)


                val parsedMessage = Json.encodeToString(messageEntity)
                member.socket.send(Frame.Text(parsedMessage))
            }
        }
    }

    suspend fun sendNotify(){

    }


    suspend fun getAllMessages(from: String?, to: String?): List<P2PMessage>? {
        return dataSource.getAllMessages(from, to)
    }

    suspend fun getLocationMessage(): List<LocationMessage>? {
        return dataSource.getLocationMessage()
    }

    suspend fun disconnect(username: String) {
        members[username]?.socket?.close()
        if (members.containsKey(username)) {
            members.remove(username)
        }
    }

}