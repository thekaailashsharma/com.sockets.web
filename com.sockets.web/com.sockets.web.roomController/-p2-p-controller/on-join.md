//[com.sockets.web](../../../index.md)/[com.sockets.web.roomController](../index.md)/[P2PController](index.md)/[onJoin](on-join.md)

# onJoin

[jvm]\
fun [onJoin](on-join.md)(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), socket: WebSocketSession)

Handles the join event of a P2P member.

#### Parameters

jvm

| | |
|---|---|
| from | The username of the member initiating the join. |
| to | The username of the member the join is directed to. |
| sessionId | The session ID of the WebSocket connection. |
| socket | The WebSocket session. |

#### Throws

| | |
|---|---|
| [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html) | if a member with the same username already exists. |
