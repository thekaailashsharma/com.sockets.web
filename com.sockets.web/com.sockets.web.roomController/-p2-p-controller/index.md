//[com.sockets.web](../../../index.md)/[com.sockets.web.roomController](../index.md)/[P2PController](index.md)

# P2PController

[jvm]\
class [P2PController](index.md)(dataSource: [P2PDataSource](../../com.sockets.web.data/-p2-p-data-source/index.md))

Controller for handling P2P (peer-to-peer) messaging and operations.

## Constructors

| | |
|---|---|
| [P2PController](-p2-p-controller.md) | [jvm]<br>constructor(dataSource: [P2PDataSource](../../com.sockets.web.data/-p2-p-data-source/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [disconnect](disconnect.md) | [jvm]<br>suspend fun [disconnect](disconnect.md)(username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Disconnects a member by closing its WebSocket session. |
| [getLocationMessage](get-location-message.md) | [jvm]<br>suspend fun [getLocationMessage](get-location-message.md)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[LocationMessage](../../com.sockets.web.data/-location-message/index.md)&gt;?<br>Retrieves location messages for the specified user. |
| [onJoin](on-join.md) | [jvm]<br>fun [onJoin](on-join.md)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), socket: WebSocketSession)<br>Handles the join event of a P2P member. |
| [sendMessage](send-message.md) | [jvm]<br>suspend fun [sendMessage](send-message.md)(fromUserName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), toUserName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;&quot;, latitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, longitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>Sends a message to the specified P2P member(s). |
