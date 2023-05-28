---
title: Member
---
//[com.sockets.web](../../../index.html)/[com.sockets.web.data](../index.html)/[Member](index.html)



# Member



[jvm]\
data class [Member](index.html)(val username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val socket: WebSocketSession)

Represents a member in a chat application.



## Constructors


| | |
|---|---|
| [Member](-member.html) | [jvm]<br>constructor(username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), socket: WebSocketSession) |


## Properties


| Name | Summary |
|---|---|
| [sessionId](session-id.html) | [jvm]<br>val [sessionId](session-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>the unique session ID of the member. |
| [socket](socket.html) | [jvm]<br>val [socket](socket.html): WebSocketSession<br>the WebSocket session associated with the member. |
| [username](username.html) | [jvm]<br>val [username](username.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>the username of the member. |

