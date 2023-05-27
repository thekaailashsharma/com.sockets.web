---
title: onJoin
---
//[com.sockets.web](../../../index.html)/[com.sockets.web.roomController](../index.html)/[RoomController](index.html)/[onJoin](on-join.html)



# onJoin



[jvm]\
fun [onJoin](on-join.html)(username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), socket: WebSocketSession)



Handles the join event of a room member.



#### Parameters


jvm

| | |
|---|---|
| username | The username of the member. |
| sessionId | The session ID of the WebSocket connection. |
| socket | The WebSocket session. |



#### Throws


| | |
|---|---|
| [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html) | if a member with the same username already exists. |



