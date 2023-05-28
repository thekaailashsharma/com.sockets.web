package com.sockets.web.utilities

/**
 * Generates a random string of alphanumeric characters.
 *
 * @param length The length of the random string to generate. Default is 11.
 * @return The randomly generated string.
 */
fun getRandomString(length: Int = 11) : String {
    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..length)
        .map { charset.random() }
        .joinToString("")
}