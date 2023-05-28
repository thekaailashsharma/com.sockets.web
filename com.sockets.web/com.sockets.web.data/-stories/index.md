//[com.sockets.web](../../../index.md)/[com.sockets.web.data](../index.md)/[Stories](index.md)

# Stories

@Serializable

data class [Stories](index.md)(val userName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val storyUpdated: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, val storyOver: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, val caption: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val image: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)

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
| [Stories](-stories.md) | [jvm]<br>constructor(userName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, storyUpdated: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, storyOver: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, caption: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, image: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) |

## Properties

| Name | Summary |
|---|---|
| [caption](caption.md) | [jvm]<br>val [caption](caption.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [image](image.md) | [jvm]<br>val [image](image.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [storyOver](story-over.md) | [jvm]<br>val [storyOver](story-over.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? |
| [storyUpdated](story-updated.md) | [jvm]<br>val [storyUpdated](story-updated.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? |
| [userName](user-name.md) | [jvm]<br>val [userName](user-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
