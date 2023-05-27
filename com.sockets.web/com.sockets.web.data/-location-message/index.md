//[com.sockets.web](../../../index.md)/[com.sockets.web.data](../index.md)/[LocationMessage](index.md)

# LocationMessage

@Serializable

data class [LocationMessage](index.md)(val from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val latitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val longitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, @BsonIdval id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ObjectId().toString())

Represents a location-based message.

#### Parameters

jvm

| | |
|---|---|
| from | the sender of the message. |
| to | the recipient of the message. |
| latitude | the latitude coordinate of the location. |
| longitude | the longitude coordinate of the location. |
| id | the unique identifier of the message. |

## Constructors

| | |
|---|---|
| [LocationMessage](-location-message.md) | [jvm]<br>constructor(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, latitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, longitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, @BsonIdid: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ObjectId().toString()) |

## Properties

| Name | Summary |
|---|---|
| [from](from.md) | [jvm]<br>val [from](from.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [id](id.md) | [jvm]<br>val [id](id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [latitude](latitude.md) | [jvm]<br>val [latitude](latitude.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [longitude](longitude.md) | [jvm]<br>val [longitude](longitude.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [to](to.md) | [jvm]<br>val [to](to.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
