package com.sockets.web.roomController

import com.sockets.web.data.DataSource
import com.sockets.web.data.Member
import com.sockets.web.data.Message
import io.ktor.websocket.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.util.concurrent.ConcurrentHashMap

class RoomController(
    private val dataSource: DataSource
) {
    private val members = ConcurrentHashMap<String, Member>()

    fun onJoin(
        username: String,
        sessionId: String,
        socket: WebSocketSession
    ) {
        if (members.contains(username)) {
            throw Exception("Member Already Exists !!")
        }
        members[username] = Member(
            username = username,
            sessionId = sessionId,
            socket = socket
        )
    }



    suspend fun sendMessage(
        senderUsername: String,
        message: String
    ) {
        members.values.forEach { member ->
            val messageEntity = Message(
                userName = senderUsername,
                text = message,
                timeStamp = System.currentTimeMillis()
            )
            dataSource.insertMessages(messageEntity)
            val parsedMessage = Json.encodeToString(messageEntity)
            member.socket.send(Frame.Text(parsedMessage))
        }
    }
    suspend fun getAllMessages(from: String?): List<Message> {
        return dataSource.getAllMessages(from = from)
    }

    suspend fun disconnect(username: String){
        members[username]?.socket?.close()
        if (members.containsKey(username)){
            members.remove(username)
        }
    }
}