//[com.sockets.web](../../../index.md)/[com.sockets.web.roomController](../index.md)/[RoomController](index.md)

# RoomController

[jvm]\
class [RoomController](index.md)(dataSource: [DataSource](../../com.sockets.web.data/-data-source/index.md))

Controller for handling chat room operations.

## Constructors

| | |
|---|---|
| [RoomController](-room-controller.md) | [jvm]<br>constructor(dataSource: [DataSource](../../com.sockets.web.data/-data-source/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [disconnect](disconnect.md) | [jvm]<br>suspend fun [disconnect](disconnect.md)(username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Disconnects a member by closing its WebSocket session. |
| [getAllMessages](get-all-messages.md) | [jvm]<br>suspend fun [getAllMessages](get-all-messages.md)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Message](../../com.sockets.web.data/-message/index.md)&gt;<br>Retrieves all chat messages for the specified user. |
| [onJoin](on-join.md) | [jvm]<br>fun [onJoin](on-join.md)(username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), socket: WebSocketSession)<br>Handles the join event of a room member. |
| [sendMessage](send-message.md) | [jvm]<br>suspend fun [sendMessage](send-message.md)(senderUsername: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Sends a message to all members in the chat room. |
