package com.sockets.web.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId
/**
 * Represents a message in a chat application.
 *
 * @param userName the username of the message sender.
 * @param text the content of the message.
 * @param timeStamp the timestamp of the message.
 * @param id the unique identifier of the message.
 */
@Serializable
data class Message(
    val userName:String,
    val text:String,
    val timeStamp:Long,
    @BsonId
    val id:String = ObjectId().toString()
)

/**
 * Represents a success response.
 *
 * @param result the result status of the response.
 * @param data additional user information.
 */
@Serializable
data class Success(
    val result: String,
    val data: UserInfo
)

/**
 * Represents a collection of stories.
 *
 * @param userName the username associated with the story.
 * @param storyUpdated the timestamp when the story was last updated.
 * @param storyOver the timestamp when the story expires.
 * @param caption the caption of the story.
 * @param image the image URL of the story.
 */
@Serializable
data class Stories(
    val userName: String?,
    val storyUpdated: Long?,
    val storyOver: Long?,
    val caption: String?,
    val image: String?,
)

/**
 * Represents user information.
 *
 * @param userName the username of the user.
 * @param name the name of the user.
 * @param email the email address of the user.
 * @param profile the URL of the user's profile picture.
 */
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

/**
 * Represents a failure response.
 *
 * @param failure the failure status of the response.
 * @param result the result details of the failure.
 */
@Serializable
data class Failure(
    val failure: String = "UnSuccessful",
    val result: String
)

/**
 * Represents an upload response.
 *
 * @param result the result status of the response.
 * @param uniqueId the unique identifier of the uploaded content.
 */
@Serializable
data class Upload(
    val result: String,
    val uniqueId : String?
)

/**
 * Represents a location-based message.
 *
 * @param from the sender of the message.
 * @param to the recipient of the message.
 * @param latitude the latitude coordinate of the location.
 * @param longitude the longitude coordinate of the location.
 * @param id the unique identifier of the message.
 */
@Serializable
data class LocationMessage(
    val from: String?,
    val to: String?,
    val latitude: String?,
    val longitude: String?,
    @BsonId
    val id:String = ObjectId().toString()
)

/**
 * Represents a peer-to-peer message.
 *
 * @param from the sender of the message.
 * @param to the recipient of the message.
 * @param text the content of the message.
 * @param timeStamp the timestamp of the message.
 * @param id the unique identifier of the message.
 */
@Serializable
data class P2PMessage(
    val from: String?,
    val to: String?,
    val text: String?,
    val timeStamp: Long?,
    @BsonId
    val id:String = ObjectId().toString()
)
