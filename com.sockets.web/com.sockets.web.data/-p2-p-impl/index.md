---
title: P2PImpl
---
//[com.sockets.web](../../../index.html)/[com.sockets.web.data](../index.html)/[P2PImpl](index.html)



# P2PImpl

class [P2PImpl](index.html)(db: CoroutineDatabase) : [P2PDataSource](../-p2-p-data-source/index.html)

Implementation of the [P2PDataSource](../-p2-p-data-source/index.html) interface for handling peer-to-peer messages and location information.



#### Parameters


jvm

| | |
|---|---|
| db | the CoroutineDatabase instance representing the database. |



## Constructors


| | |
|---|---|
| [P2PImpl](-p2-p-impl.html) | [jvm]<br>constructor(db: CoroutineDatabase) |


## Functions


| Name | Summary |
|---|---|
| [getAllMessages](get-all-messages.html) | [jvm]<br>open suspend override fun [getAllMessages](get-all-messages.html)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[P2PMessage](../-p2-p-message/index.html)&gt;<br>Retrieves all P2P messages from the data source. |
| [getLocationMessage](get-location-message.html) | [jvm]<br>open suspend override fun [getLocationMessage](get-location-message.html)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[LocationMessage](../-location-message/index.html)&gt;?<br>Retrieves all location messages from the data source. |
| [insertLocation](insert-location.html) | [jvm]<br>open suspend override fun [insertLocation](insert-location.html)(location: [LocationMessage](../-location-message/index.html))<br>Inserts a new location message into the data source. |
| [insertMessages](insert-messages.html) | [jvm]<br>open suspend override fun [insertMessages](insert-messages.html)(message: [P2PMessage](../-p2-p-message/index.html))<br>Inserts a new P2P message into the data source. |

