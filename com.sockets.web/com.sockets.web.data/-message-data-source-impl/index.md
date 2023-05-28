//[com.sockets.web](../../../index.md)/[com.sockets.web.data](../index.md)/[MessageDataSourceImpl](index.md)

# MessageDataSourceImpl

class [MessageDataSourceImpl](index.md)(db: CoroutineDatabase) : [DataSource](../-data-source/index.md)

Implementation of the [DataSource](../-data-source/index.md) interface for handling messages.

#### Parameters

jvm

| | |
|---|---|
| db | the CoroutineDatabase instance representing the database. |

## Constructors

| | |
|---|---|
| [MessageDataSourceImpl](-message-data-source-impl.md) | [jvm]<br>constructor(db: CoroutineDatabase) |

## Functions

| Name | Summary |
|---|---|
| [getAllMessages](get-all-messages.md) | [jvm]<br>open suspend override fun [getAllMessages](get-all-messages.md)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Message](../-message/index.md)&gt;<br>Retrieves all messages from the data source. |
| [insertMessages](insert-messages.md) | [jvm]<br>open suspend override fun [insertMessages](insert-messages.md)(message: [Message](../-message/index.md))<br>Inserts a new message into the data source. |
