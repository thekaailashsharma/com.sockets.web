package com.sockets.web.sessions

/**
 * Represents a chat session.
 *
 * @property userName The username associated with the chat session.
 * @property sessionId The session ID of the chat session.
 */
data class ChatSession(
    val userName: String,
    val sessionId: String
)

/**
 * Represents a peer-to-peer chat session.
 *
 * @property from The sender of the chat message.
 * @property to The recipient of the chat message.
 * @property latitude The latitude value for location data (optional).
 * @property longitude The longitude value for location data (optional).
 * @property sessionId The session ID of the chat session.
 */
data class P2PSession(
    val from: String,
    val to: String,
    val latitude: String? = "",
    val longitude: String? = "",
    val sessionId: String
)