---
title: P2PController
---
//[com.sockets.web](../../../index.html)/[com.sockets.web.roomController](../index.html)/[P2PController](index.html)



# P2PController



[jvm]\
class [P2PController](index.html)(dataSource: [P2PDataSource](../../com.sockets.web.data/-p2-p-data-source/index.html))

Controller for handling P2P (peer-to-peer) messaging and operations.



## Constructors


| | |
|---|---|
| [P2PController](-p2-p-controller.html) | [jvm]<br>constructor(dataSource: [P2PDataSource](../../com.sockets.web.data/-p2-p-data-source/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [disconnect](disconnect.html) | [jvm]<br>suspend fun [disconnect](disconnect.html)(username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Disconnects a member by closing its WebSocket session. |
| [getLocationMessage](get-location-message.html) | [jvm]<br>suspend fun [getLocationMessage](get-location-message.html)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[LocationMessage](../../com.sockets.web.data/-location-message/index.html)&gt;?<br>Retrieves location messages for the specified user. |
| [onJoin](on-join.html) | [jvm]<br>fun [onJoin](on-join.html)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), socket: WebSocketSession)<br>Handles the join event of a P2P member. |
| [sendMessage](send-message.html) | [jvm]<br>suspend fun [sendMessage](send-message.html)(fromUserName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), toUserName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;&quot;, latitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, longitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>Sends a message to the specified P2P member(s). |

