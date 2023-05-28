---
title: sendMessage
---
//[com.sockets.web](../../../index.html)/[com.sockets.web.roomController](../index.html)/[P2PController](index.html)/[sendMessage](send-message.html)



# sendMessage



[jvm]\
suspend fun [sendMessage](send-message.html)(fromUserName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), toUserName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;&quot;, latitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, longitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)



Sends a message to the specified P2P member(s).



#### Parameters


jvm

| | |
|---|---|
| fromUserName | The username of the sender. |
| toUserName | The username of the recipient. |
| message | The text message to send. |
| latitude | The latitude of the location (optional). |
| longitude | The longitude of the location (optional). |




