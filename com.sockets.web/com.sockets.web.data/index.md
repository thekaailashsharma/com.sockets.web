---
title: com.sockets.web.data
---
//[com.sockets.web](../../index.html)/[com.sockets.web.data](index.html)



# Package-level declarations



## Types


| Name | Summary |
|---|---|
| [DataSource](-data-source/index.html) | [jvm]<br>interface [DataSource](-data-source/index.html)<br>Interface for a data source handling messages. |
| [Failure](-failure/index.html) | [jvm]<br>@Serializable<br>data class [Failure](-failure/index.html)(val failure: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;UnSuccessful&quot;, val result: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Represents a failure response. |
| [LocationMember](-location-member/index.html) | [jvm]<br>data class [LocationMember](-location-member/index.html)(val latitude: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), val longitude: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), val socket: WebSocketSession)<br>Represents a member with location information. |
| [LocationMessage](-location-message/index.html) | [jvm]<br>@Serializable<br>data class [LocationMessage](-location-message/index.html)(val from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val latitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val longitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, @BsonIdval id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ObjectId().toString())<br>Represents a location-based message. |
| [Member](-member/index.html) | [jvm]<br>data class [Member](-member/index.html)(val username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val socket: WebSocketSession)<br>Represents a member in a chat application. |
| [Message](-message/index.html) | [jvm]<br>@Serializable<br>data class [Message](-message/index.html)(val userName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val timeStamp: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), @BsonIdval id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ObjectId().toString())<br>Represents a message in a chat application. |
| [MessageDataSourceImpl](-message-data-source-impl/index.html) | [jvm]<br>class [MessageDataSourceImpl](-message-data-source-impl/index.html)(db: CoroutineDatabase) : [DataSource](-data-source/index.html)<br>Implementation of the [DataSource](-data-source/index.html) interface for handling messages. |
| [P2PDataSource](-p2-p-data-source/index.html) | [jvm]<br>interface [P2PDataSource](-p2-p-data-source/index.html) |
| [P2PImpl](-p2-p-impl/index.html) | [jvm]<br>class [P2PImpl](-p2-p-impl/index.html)(db: CoroutineDatabase) : [P2PDataSource](-p2-p-data-source/index.html)<br>Implementation of the [P2PDataSource](-p2-p-data-source/index.html) interface for handling peer-to-peer messages and location information. |
| [P2PMember](-p2-p-member/index.html) | [jvm]<br>data class [P2PMember](-p2-p-member/index.html)(val from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val socket: WebSocketSession)<br>Represents a member in a peer-to-peer messaging system. |
| [P2PMessage](-p2-p-message/index.html) | [jvm]<br>@Serializable<br>data class [P2PMessage](-p2-p-message/index.html)(val from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val timeStamp: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, @BsonIdval id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ObjectId().toString())<br>Represents a peer-to-peer message. |
| [Stories](-stories/index.html) | [jvm]<br>@Serializable<br>data class [Stories](-stories/index.html)(val userName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val storyUpdated: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, val storyOver: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, val caption: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val image: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)<br>Represents a collection of stories. |
| [Success](-success/index.html) | [jvm]<br>@Serializable<br>data class [Success](-success/index.html)(val result: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val data: [UserInfo](-user-info/index.html))<br>Represents a success response. |
| [Upload](-upload/index.html) | [jvm]<br>@Serializable<br>data class [Upload](-upload/index.html)(val result: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val uniqueId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)<br>Represents an upload response. |
| [UserInfo](-user-info/index.html) | [jvm]<br>@Serializable<br>data class [UserInfo](-user-info/index.html)(@BsonIdval userName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val email: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val profile: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>Represents user information. |

