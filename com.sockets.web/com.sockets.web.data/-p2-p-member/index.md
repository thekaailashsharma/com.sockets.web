//[com.sockets.web](../../../index.md)/[com.sockets.web.data](../index.md)/[P2PMember](index.md)

# P2PMember

[jvm]\
data class [P2PMember](index.md)(val from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val socket: WebSocketSession)

Represents a member in a peer-to-peer messaging system.

## Constructors

| | |
|---|---|
| [P2PMember](-p2-p-member.md) | [jvm]<br>constructor(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), socket: WebSocketSession) |

## Properties

| Name | Summary |
|---|---|
| [from](from.md) | [jvm]<br>val [from](from.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>the sender of the message. |
| [sessionId](session-id.md) | [jvm]<br>val [sessionId](session-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>the unique session ID of the member. |
| [socket](socket.md) | [jvm]<br>val [socket](socket.md): WebSocketSession<br>the WebSocket session associated with the member. |
| [to](to.md) | [jvm]<br>val [to](to.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>the recipient of the message. |
