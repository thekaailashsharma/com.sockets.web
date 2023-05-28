---
title: UserInfo
---
//[com.sockets.web](../../../index.html)/[com.sockets.web.data](../index.html)/[UserInfo](index.html)



# UserInfo





@Serializable



data class [UserInfo](index.html)(@BsonIdval userName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val email: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val profile: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)

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
| [UserInfo](-user-info.html) | [jvm]<br>constructor(@BsonIduserName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), email: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), profile: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Properties


| Name | Summary |
|---|---|
| [email](email.html) | [jvm]<br>val [email](email.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.html) | [jvm]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [profile](profile.html) | [jvm]<br>val [profile](profile.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [userName](user-name.html) | [jvm]<br>val [userName](user-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

