package com.sockets.web.utilities

fun getRandomString(length: Int = 11) : String {
    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..length)
        .map { charset.random() }
        .joinToString("")
}