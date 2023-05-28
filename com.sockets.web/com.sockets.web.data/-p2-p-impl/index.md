//[com.sockets.web](../../../index.md)/[com.sockets.web.data](../index.md)/[P2PImpl](index.md)

# P2PImpl

class [P2PImpl](index.md)(db: CoroutineDatabase) : [P2PDataSource](../-p2-p-data-source/index.md)

Implementation of the [P2PDataSource](../-p2-p-data-source/index.md) interface for handling peer-to-peer messages and location information.

#### Parameters

jvm

| | |
|---|---|
| db | the CoroutineDatabase instance representing the database. |

## Constructors

| | |
|---|---|
| [P2PImpl](-p2-p-impl.md) | [jvm]<br>constructor(db: CoroutineDatabase) |

## Functions

| Name | Summary |
|---|---|
| [getAllMessages](get-all-messages.md) | [jvm]<br>open suspend override fun [getAllMessages](get-all-messages.md)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[P2PMessage](../-p2-p-message/index.md)&gt;<br>Retrieves all P2P messages from the data source. |
| [getLocationMessage](get-location-message.md) | [jvm]<br>open suspend override fun [getLocationMessage](get-location-message.md)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[LocationMessage](../-location-message/index.md)&gt;?<br>Retrieves all location messages from the data source. |
| [insertLocation](insert-location.md) | [jvm]<br>open suspend override fun [insertLocation](insert-location.md)(location: [LocationMessage](../-location-message/index.md))<br>Inserts a new location message into the data source. |
| [insertMessages](insert-messages.md) | [jvm]<br>open suspend override fun [insertMessages](insert-messages.md)(message: [P2PMessage](../-p2-p-message/index.md))<br>Inserts a new P2P message into the data source. |
