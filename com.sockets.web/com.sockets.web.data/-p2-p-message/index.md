//[com.sockets.web](../../../index.md)/[com.sockets.web.data](../index.md)/[P2PMessage](index.md)

# P2PMessage

@Serializable

data class [P2PMessage](index.md)(val from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val timeStamp: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, @BsonIdval id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ObjectId().toString())

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
| [P2PMessage](-p2-p-message.md) | [jvm]<br>constructor(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, timeStamp: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, @BsonIdid: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ObjectId().toString()) |

## Properties

| Name | Summary |
|---|---|
| [from](from.md) | [jvm]<br>val [from](from.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [id](id.md) | [jvm]<br>val [id](id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [text](text.md) | [jvm]<br>val [text](text.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [timeStamp](time-stamp.md) | [jvm]<br>val [timeStamp](time-stamp.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? |
| [to](to.md) | [jvm]<br>val [to](to.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
