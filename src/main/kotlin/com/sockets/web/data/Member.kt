package com.sockets.web.data

import io.ktor.websocket.*

data class Member(
    val username: String,
    val sessionId: String,
    val socket: WebSocketSession
)

data class LocationMember(
    val latitude: Long,
    val longitude: Long,
    val socket: WebSocketSession
)

data class P2PMember(
    val from: String?,
    val to: String?,
    val sessionId: String,
    val socket: WebSocketSession
)
