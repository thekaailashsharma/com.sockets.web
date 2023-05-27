//[com.sockets.web](../../../index.md)/[com.sockets.web.data](../index.md)/[P2PImpl](index.md)/[getAllMessages](get-all-messages.md)

# getAllMessages

[jvm]\
open suspend override fun [getAllMessages](get-all-messages.md)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[P2PMessage](../-p2-p-message/index.md)&gt;

Retrieves all P2P messages from the data source.

#### Return

a list of P2P messages.

#### Parameters

jvm

| | |
|---|---|
| from | optional filter to retrieve messages from a specific sender. |
| to | optional filter to retrieve messages for a specific recipient. |
