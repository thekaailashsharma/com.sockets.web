---
title: getAllMessages
---
//[com.sockets.web](../../../index.html)/[com.sockets.web.data](../index.html)/[P2PDataSource](index.html)/[getAllMessages](get-all-messages.html)



# getAllMessages



[jvm]\
abstract suspend fun [getAllMessages](get-all-messages.html)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[P2PMessage](../-p2-p-message/index.html)&gt;?



Retrieves all P2P messages from the data source.



#### Return



a list of P2P messages.



#### Parameters


jvm

| | |
|---|---|
| from | optional filter to retrieve messages from a specific sender. |
| to | optional filter to retrieve messages for a specific recipient. |




