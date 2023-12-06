package lesson14

class Chat {

    val messageList: MutableList<Message> = mutableListOf()

    fun addMessage(_author: String, _text: String) {
        val newMessage = Message(
            id = messageList.size,
            author = _author,
            text = _text,
        )
        messageList.add(newMessage)
    }

    fun addThreadMessage(_author: String, _text: String, _parentMessageId: Int) {
        val threadMessage = ChildMessage(
            id = messageList.size,
            author = _author,
            text = _text,
            parentMessageId = _parentMessageId,
            )
        messageList.add(threadMessage)
    }

    fun printChat() {
//        messageList.sortBy {  }
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

    chat.addMessage("Dima", "Привет 1")

    chat.addThreadMessage("None", "Привет 2", chat.messageList[0].id)

}