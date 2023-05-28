//[com.sockets.web](../../../index.md)/[com.sockets.web.data](../index.md)/[DataSource](index.md)

# DataSource

interface [DataSource](index.md)

Interface for a data source handling messages.

#### Inheritors

| |
|---|
| [MessageDataSourceImpl](../-message-data-source-impl/index.md) |

## Functions

| Name | Summary |
|---|---|
| [getAllMessages](get-all-messages.md) | [jvm]<br>abstract suspend fun [getAllMessages](get-all-messages.md)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Message](../-message/index.md)&gt;<br>Retrieves all messages from the data source. |
| [insertMessages](insert-messages.md) | [jvm]<br>abstract suspend fun [insertMessages](insert-messages.md)(message: [Message](../-message/index.md))<br>Inserts a new message into the data source. |
