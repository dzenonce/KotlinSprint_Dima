package lesson14

class Chat {

    val chatMessage: MutableList<Message> = mutableListOf()

    fun addMessage(authorMessage: String, messageText: String) {
        val parentMessage = Message(
            parentId = chatMessage.size,
            author = authorMessage,
            text = messageText,
        )

        chatMessage.add(parentMessage)
    }

    fun addThreadMessage(parentMessageId: Int, authorMessage: String, messageText: String) {
        val childMessage = ChildMessage(
            childMessageId = chatMessage.size,
            parentId = parentMessageId,
            author = authorMessage,
            text = messageText,
        )

        chatMessage.add(childMessage)
    }

    fun printChat() {
        chatMessage.forEach() { println("${it.author}: ${it.text}") }
        chatMessage.groupBy { println(it.parentId) }
    }
}

open class Message(
    val parentId: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    val childMessageId: Int,
    parentId: Int,
    author: String,
    text: String,
) : Message(parentId, author, text)

fun main() {

    val chat = Chat()

    chat.addMessage("Dima", "Привет, это первое сообщение")

    chat.addThreadMessage(0, "None", "Да, привет")

    chat.printChat()

}
