---
title: P2PMember
---
//[com.sockets.web](../../../index.html)/[com.sockets.web.data](../index.html)/[P2PMember](index.html)



# P2PMember



[jvm]\
data class [P2PMember](index.html)(val from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val socket: WebSocketSession)

Represents a member in a peer-to-peer messaging system.



## Constructors


| | |
|---|---|
| [P2PMember](-p2-p-member.html) | [jvm]<br>constructor(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), socket: WebSocketSession) |


## Properties


| Name | Summary |
|---|---|
| [from](from.html) | [jvm]<br>val [from](from.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>the sender of the message. |
| [sessionId](session-id.html) | [jvm]<br>val [sessionId](session-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>the unique session ID of the member. |
| [socket](socket.html) | [jvm]<br>val [socket](socket.html): WebSocketSession<br>the WebSocket session associated with the member. |
| [to](to.html) | [jvm]<br>val [to](to.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>the recipient of the message. |

