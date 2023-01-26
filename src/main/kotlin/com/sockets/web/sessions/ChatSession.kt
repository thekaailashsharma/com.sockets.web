package com.sockets.web.sessions

data class ChatSession(
    val userName: String,
    val sessionId: String
)

data class P2PSession(
    val from: String,
    val to: String,
    val latitude: String? = "",
    val longitude: String? = "",
    val sessionId: String
)