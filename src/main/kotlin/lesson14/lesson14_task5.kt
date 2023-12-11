package lesson14

class Chat {

    val messageList: MutableList<Message> = mutableListOf()
    val childMessageList: MutableList<ChildMessage> = mutableListOf()

    fun addMessage(_author: String, _text: String): Message {
        val newMessage = Message(
            id = messageList.size,
            author = _author,
            text = _text,
        )
        messageList.add(newMessage)
        return newMessage
    }

    fun addThreadMessage(_author: String, _text: String, _parentMessageId: Int) {
        val threadMessage = ChildMessage(
            id = messageList.size,
            author = _author,
            text = _text,
            parentMessageId = _parentMessageId,
        )
        childMessageList.add(threadMessage)
    }

    fun printChat() {

        val groupedChildMessage = childMessageList.groupBy { it.parentMessageId }

        for (message in messageList) {
            println("${message.author}: ${message.text}")

            groupedChildMessage[message.id]?.forEach() {
                println("\t${it.author}: ${it.text}")
            }
        }
    }

}

open class Message(
    val id: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int
) : Message(id, author, text)

fun main() {

    val chat = Chat()

    val newMessage = chat.addMessage("Dima", "Привет 1")

    chat.addThreadMessage("None", "Привет 2", newMessage.id)
    chat.addThreadMessage("ANone", "Привет 3", newMessage.id)

    val newMessage2 = chat.addMessage("Dima1", "Привет 2")
    chat.addThreadMessage("ANone", "Привет 3", newMessage2.id)

    chat.printChat()

}
