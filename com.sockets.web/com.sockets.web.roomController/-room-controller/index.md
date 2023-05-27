---
title: RoomController
---
//[com.sockets.web](../../../index.html)/[com.sockets.web.roomController](../index.html)/[RoomController](index.html)



# RoomController



[jvm]\
class [RoomController](index.html)(dataSource: [DataSource](../../com.sockets.web.data/-data-source/index.html))

Controller for handling chat room operations.



## Constructors


| | |
|---|---|
| [RoomController](-room-controller.html) | [jvm]<br>constructor(dataSource: [DataSource](../../com.sockets.web.data/-data-source/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [disconnect](disconnect.html) | [jvm]<br>suspend fun [disconnect](disconnect.html)(username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Disconnects a member by closing its WebSocket session. |
| [getAllMessages](get-all-messages.html) | [jvm]<br>suspend fun [getAllMessages](get-all-messages.html)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Message](../../com.sockets.web.data/-message/index.html)&gt;<br>Retrieves all chat messages for the specified user. |
| [onJoin](on-join.html) | [jvm]<br>fun [onJoin](on-join.html)(username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), socket: WebSocketSession)<br>Handles the join event of a room member. |
| [sendMessage](send-message.html) | [jvm]<br>suspend fun [sendMessage](send-message.html)(senderUsername: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Sends a message to all members in the chat room. |

