//[com.sockets.web](../../../index.md)/[com.sockets.web.data](../index.md)/[UserInfo](index.md)

# UserInfo

@Serializable

data class [UserInfo](index.md)(@BsonIdval userName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val email: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val profile: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)

Represents user information.

#### Parameters

jvm

| | |
|---|---|
| userName | the username of the user. |
| name | the name of the user. |
| email | the email address of the user. |
| profile | the URL of the user's profile picture. |

## Constructors

| | |
|---|---|
| [UserInfo](-user-info.md) | [jvm]<br>constructor(@BsonIduserName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), email: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), profile: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |

## Properties

| Name | Summary |
|---|---|
| [email](email.md) | [jvm]<br>val [email](email.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.md) | [jvm]<br>val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [profile](profile.md) | [jvm]<br>val [profile](profile.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [userName](user-name.md) | [jvm]<br>val [userName](user-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
