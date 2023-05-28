//[com.sockets.web](../../../index.md)/[com.sockets.web.data](../index.md)/[Member](index.md)

# Member

[jvm]\
data class [Member](index.md)(val username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val socket: WebSocketSession)

Represents a member in a chat application.

## Constructors

| | |
|---|---|
| [Member](-member.md) | [jvm]<br>constructor(username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), socket: WebSocketSession) |

## Properties

| Name | Summary |
|---|---|
| [sessionId](session-id.md) | [jvm]<br>val [sessionId](session-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>the unique session ID of the member. |
| [socket](socket.md) | [jvm]<br>val [socket](socket.md): WebSocketSession<br>the WebSocket session associated with the member. |
| [username](username.md) | [jvm]<br>val [username](username.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>the username of the member. |
