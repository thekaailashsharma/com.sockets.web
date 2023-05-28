package com.sockets.web.data

import io.ktor.websocket.*

/**
 * Represents a member in a chat application.
 *
 * @property username the username of the member.
 * @property sessionId the unique session ID of the member.
 * @property socket the WebSocket session associated with the member.
 */
data class Member(
    val username: String,
    val sessionId: String,
    val socket: WebSocketSession
)
/**
 * Represents a member with location information.
 *
 * @property latitude the latitude coordinate of the member's location.
 * @property longitude the longitude coordinate of the member's location.
 * @property socket the WebSocket session associated with the member.
 */
data class LocationMember(
    val latitude: Long,
    val longitude: Long,
    val socket: WebSocketSession
)
/**
 * Represents a member in a peer-to-peer messaging system.
 *
 * @property from the sender of the message.
 * @property to the recipient of the message.
 * @property sessionId the unique session ID of the member.
 * @property socket the WebSocket session associated with the member.
 */
data class P2PMember(
    val from: String?,
    val to: String?,
    val sessionId: String,
    val socket: WebSocketSession
)
