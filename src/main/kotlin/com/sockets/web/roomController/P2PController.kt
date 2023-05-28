package com.sockets.web.roomController

import com.sockets.web.data.*
import io.ktor.websocket.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.util.concurrent.ConcurrentHashMap


/**
 * Controller for handling P2P (peer-to-peer) messaging and operations.
 *
 * @property dataSource The data source for P2P messages and location messages.
 * @property members A concurrent hash map to store the active P2P members.
 */
class P2PController(
    private val dataSource: P2PDataSource
) {
    private val members = ConcurrentHashMap<String, P2PMember>()

    /**
     * Handles the join event of a P2P member.
     *
     * @param from The username of the member initiating the join.
     * @param to The username of the member the join is directed to.
     * @param sessionId The session ID of the WebSocket connection.
     * @param socket The WebSocket session.
     * @throws Exception if a member with the same username already exists.
     */
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

    /**
     * Sends a message to the specified P2P member(s).
     *
     * @param fromUserName The username of the sender.
     * @param toUserName The username of the recipient.
     * @param message The text message to send.
     * @param latitude The latitude of the location (optional).
     * @param longitude The longitude of the location (optional).
     */
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

    /**
     * Retrieves location messages for the specified user.
     *
     * @param from The username of the user.
     * @return A list of location messages.
     */
    suspend fun getLocationMessage(from: String?): List<LocationMessage>? {
        return dataSource.getLocationMessage(from = from)
    }

    /**
     * Disconnects a member by closing its WebSocket session.
     *
     * @param username The username of the member to disconnect.
     */
    suspend fun disconnect(username: String) {
        members[username]?.socket?.close()
        if (members.containsKey(username)) {
            members.remove(username)
        }
    }

}