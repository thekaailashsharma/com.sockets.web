---
title: Stories
---
//[com.sockets.web](../../../index.html)/[com.sockets.web.data](../index.html)/[Stories](index.html)



# Stories





@Serializable



data class [Stories](index.html)(val userName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val storyUpdated: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, val storyOver: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, val caption: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val image: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)

Represents a collection of stories.



#### Parameters


jvm

| | |
|---|---|
| userName | the username associated with the story. |
| storyUpdated | the timestamp when the story was last updated. |
| storyOver | the timestamp when the story expires. |
| caption | the caption of the story. |
| image | the image URL of the story. |



## Constructors


| | |
|---|---|
| [Stories](-stories.html) | [jvm]<br>constructor(userName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, storyUpdated: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, storyOver: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, caption: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, image: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) |


## Properties


| Name | Summary |
|---|---|
| [caption](caption.html) | [jvm]<br>val [caption](caption.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [image](image.html) | [jvm]<br>val [image](image.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [storyOver](story-over.html) | [jvm]<br>val [storyOver](story-over.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? |
| [storyUpdated](story-updated.html) | [jvm]<br>val [storyUpdated](story-updated.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? |
| [userName](user-name.html) | [jvm]<br>val [userName](user-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

