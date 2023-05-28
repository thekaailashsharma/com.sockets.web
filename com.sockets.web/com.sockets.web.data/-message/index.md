---
title: Message
---
//[com.sockets.web](../../../index.html)/[com.sockets.web.data](../index.html)/[Message](index.html)



# Message





@Serializable



data class [Message](index.html)(val userName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val timeStamp: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), @BsonIdval id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ObjectId().toString())

Represents a message in a chat application.



#### Parameters


jvm

| | |
|---|---|
| userName | the username of the message sender. |
| text | the content of the message. |
| timeStamp | the timestamp of the message. |
| id | the unique identifier of the message. |



## Constructors


| | |
|---|---|
| [Message](-message.html) | [jvm]<br>constructor(userName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), timeStamp: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), @BsonIdid: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ObjectId().toString()) |


## Properties


| Name | Summary |
|---|---|
| [id](id.html) | [jvm]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [text](text.html) | [jvm]<br>val [text](text.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [timeStamp](time-stamp.html) | [jvm]<br>val [timeStamp](time-stamp.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [userName](user-name.html) | [jvm]<br>val [userName](user-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

