---
title: DataSource
---
//[com.sockets.web](../../../index.html)/[com.sockets.web.data](../index.html)/[DataSource](index.html)



# DataSource

interface [DataSource](index.html)

Interface for a data source handling messages.



#### Inheritors


| |
|---|
| [MessageDataSourceImpl](../-message-data-source-impl/index.html) |


## Functions


| Name | Summary |
|---|---|
| [getAllMessages](get-all-messages.html) | [jvm]<br>abstract suspend fun [getAllMessages](get-all-messages.html)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Message](../-message/index.html)&gt;<br>Retrieves all messages from the data source. |
| [insertMessages](insert-messages.html) | [jvm]<br>abstract suspend fun [insertMessages](insert-messages.html)(message: [Message](../-message/index.html))<br>Inserts a new message into the data source. |

