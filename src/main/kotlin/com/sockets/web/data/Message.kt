package com.sockets.web.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

@Serializable
data class Message(
    val userName:String,
    val text:String,
    val timeStamp:Long,
    @BsonId
    val id:String = ObjectId().toString()
)

@Serializable
data class Success(
    val result: String,
    val data: UserInfo
)

@Serializable
data class Stories(
    val userName: String?,
    val storyUpdated: Long?,
    val storyOver: Long?,
    val caption: String?,
    val image: String?,
)

@Serializable
data class UserInfo(
    @BsonId
    @SerialName("userName")
    val userName: String,
    @SerialName("name")
    val name: String,
    @SerialName("email")
    val email: String,
    @SerialName("profile")
    val profile : String? = null,
)

@Serializable
data class Failure(
    val failure: String = "UnSuccessful",
    val result: String
)

@Serializable
data class Upload(
    val result: String,
    val uniqueId : String?
)


@Serializable
data class LocationMessage(
    val from: String?,
    val to: String?,
    val latitude: String?,
    val longitude: String?,
    @BsonId
    val id:String = ObjectId().toString()
)

@Serializable
data class P2PMessage(
    val from: String?,
    val to: String?,
    val text: String?,
    val timeStamp: Long?,
    @BsonId
    val id:String = ObjectId().toString()
)
