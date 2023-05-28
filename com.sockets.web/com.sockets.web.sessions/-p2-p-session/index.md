---
title: P2PSession
---
//[com.sockets.web](../../../index.html)/[com.sockets.web.sessions](../index.html)/[P2PSession](index.html)



# P2PSession



[jvm]\
data class [P2PSession](index.html)(val from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val latitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = &quot;&quot;, val longitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = &quot;&quot;, val sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Represents a peer-to-peer chat session.



## Constructors


| | |
|---|---|
| [P2PSession](-p2-p-session.html) | [jvm]<br>constructor(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), latitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = &quot;&quot;, longitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = &quot;&quot;, sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [from](from.html) | [jvm]<br>val [from](from.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The sender of the chat message. |
| [latitude](latitude.html) | [jvm]<br>val [latitude](latitude.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>The latitude value for location data (optional). |
| [longitude](longitude.html) | [jvm]<br>val [longitude](longitude.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>The longitude value for location data (optional). |
| [sessionId](session-id.html) | [jvm]<br>val [sessionId](session-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The session ID of the chat session. |
| [to](to.html) | [jvm]<br>val [to](to.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The recipient of the chat message. |

