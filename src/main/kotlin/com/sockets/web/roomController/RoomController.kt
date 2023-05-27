package com.sockets.web.roomController

import com.sockets.web.data.DataSource
import com.sockets.web.data.Member
import com.sockets.web.data.Message
import io.ktor.websocket.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.util.concurrent.ConcurrentHashMap

/**
 * Controller for handling chat room operations.
 *
 * @property dataSource The data source for chat messages.
 * @property members A concurrent hash map to store the active room members.
 */
class RoomController(
    private val dataSource: DataSource
) {
    private val members = ConcurrentHashMap<String, Member>()

    /**
     * Handles the join event of a room member.
     *
     * @param username The username of the member.
     * @param sessionId The session ID of the WebSocket connection.
     * @param socket The WebSocket session.
     * @throws Exception if a member with the same username already exists.
     */
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


    /**
     * Sends a message to all members in the chat room.
     *
     * @param senderUsername The username of the sender.
     * @param message The text message to send.
     */
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

    /**
     * Retrieves all chat messages for the specified user.
     *
     * @param from The username of the user.
     * @return A list of chat messages.
     */
    suspend fun getAllMessages(from: String?): List<Message> {
        return dataSource.getAllMessages(from = from)
    }

    /**
     * Disconnects a member by closing its WebSocket session.
     *
     * @param username The username of the member to disconnect.
     */
    suspend fun disconnect(username: String){
        members[username]?.socket?.close()
        if (members.containsKey(username)){
            members.remove(username)
        }
    }
}