//[com.sockets.web](../../../index.md)/[com.sockets.web.data](../index.md)/[Message](index.md)

# Message

@Serializable

data class [Message](index.md)(val userName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val timeStamp: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), @BsonIdval id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ObjectId().toString())

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
| [Message](-message.md) | [jvm]<br>constructor(userName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), timeStamp: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), @BsonIdid: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ObjectId().toString()) |

## Properties

| Name | Summary |
|---|---|
| [id](id.md) | [jvm]<br>val [id](id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [text](text.md) | [jvm]<br>val [text](text.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [timeStamp](time-stamp.md) | [jvm]<br>val [timeStamp](time-stamp.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [userName](user-name.md) | [jvm]<br>val [userName](user-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
