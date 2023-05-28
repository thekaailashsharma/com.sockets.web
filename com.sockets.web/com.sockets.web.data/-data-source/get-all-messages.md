//[com.sockets.web](../../../index.md)/[com.sockets.web.data](../index.md)/[DataSource](index.md)/[getAllMessages](get-all-messages.md)

# getAllMessages

[jvm]\
abstract suspend fun [getAllMessages](get-all-messages.md)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Message](../-message/index.md)&gt;

Retrieves all messages from the data source.

#### Return

a list of messages.

#### Parameters

jvm

| | |
|---|---|
| from | optional filter to retrieve messages from a specific sender. |
