//[com.sockets.web](../../../index.md)/[com.sockets.web.sessions](../index.md)/[P2PSession](index.md)

# P2PSession

[jvm]\
data class [P2PSession](index.md)(val from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val latitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = &quot;&quot;, val longitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = &quot;&quot;, val sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Represents a peer-to-peer chat session.

## Constructors

| | |
|---|---|
| [P2PSession](-p2-p-session.md) | [jvm]<br>constructor(from: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), to: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), latitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = &quot;&quot;, longitude: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = &quot;&quot;, sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [from](from.md) | [jvm]<br>val [from](from.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The sender of the chat message. |
| [latitude](latitude.md) | [jvm]<br>val [latitude](latitude.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>The latitude value for location data (optional). |
| [longitude](longitude.md) | [jvm]<br>val [longitude](longitude.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>The longitude value for location data (optional). |
| [sessionId](session-id.md) | [jvm]<br>val [sessionId](session-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The session ID of the chat session. |
| [to](to.md) | [jvm]<br>val [to](to.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The recipient of the chat message. |
