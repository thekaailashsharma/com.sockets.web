---
title: MessageDataSourceImpl
---
//[com.sockets.web](../../../index.html)/[com.sockets.web.data](../index.html)/[MessageDataSourceImpl](index.html)



# MessageDataSourceImpl

class [MessageDataSourceImpl](index.html)(db: CoroutineDatabase) : [DataSource](../-data-source/index.html)

Implementation of the [DataSource](../-data-source/index.html) interface for handling messages.



#### Parameters


jvm

| | |
|---|---|
| db | the CoroutineDatabase instance representing the database. |



## Constructors


| | |
|---|---|
| [MessageDataSourceImpl](-message-data-source-impl.html) | [jvm]<br>constructor(db: CoroutineDatabase) |


## Functions


| Name | Summary |
|---|---|
| [getAllMessages](get-all-messages.html) | [jvm]<br>open suspend override fun [getAllMessages](get-all-messages.html)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Message](../-message/index.html)&gt;<br>Retrieves all messages from the data source. |
| [insertMessages](insert-messages.html) | [jvm]<br>open suspend override fun [insertMessages](insert-messages.html)(message: [Message](../-message/index.html))<br>Inserts a new message into the data source. |

