package com.sockets.web.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class applinksItem(
    @SerialName("relation")
    val relation: List<String?>?,
    @SerialName("target")
    val target: Target?
)