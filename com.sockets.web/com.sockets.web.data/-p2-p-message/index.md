---
title: P2PMessage
---
//[com.sockets.web](../../../index.html)/[com.sockets.web.data](../index.html)/[P2PMessage](index.html)



# P2PMessage





@Serializable



data class [P2PMessage](index.html)(val from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val timeStamp: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, @BsonIdval id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ObjectId().toString())

Represents a peer-to-peer message.



#### Parameters


jvm

| | |
|---|---|
| from | the sender of the message. |
| to | the recipient of the message. |
| text | the content of the message. |
| timeStamp | the timestamp of the message. |
| id | the unique identifier of the message. |



## Constructors


| | |
|---|---|
| [P2PMessage](-p2-p-message.html) | [jvm]<br>constructor(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, timeStamp: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, @BsonIdid: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ObjectId().toString()) |


## Properties


| Name | Summary |
|---|---|
| [from](from.html) | [jvm]<br>val [from](from.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [id](id.html) | [jvm]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [text](text.html) | [jvm]<br>val [text](text.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [timeStamp](time-stamp.html) | [jvm]<br>val [timeStamp](time-stamp.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? |
| [to](to.html) | [jvm]<br>val [to](to.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

