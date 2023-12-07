package lesson14

class Chat {

    val messageList: MutableList<Message> = mutableListOf()
    val childMessageList: MutableList<ChildMessage> = mutableListOf()


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
        childMessageList.add(threadMessage)
    }

    fun printChat() {

        val groupedByIdParent = messageList.groupBy { it.id }
//        println(groupedByIdParent)

        val groupedChildMessage = childMessageList.groupBy { it.parentMessageId }
//        println(groupedChildMessage)

//        if (groupedChildMessage.isNotEmpty()) {
//            groupedByIdParent.forEach() {
//                if (it.key.equals(groupedChildMessage.keys)) {
//                    println()
//                }
//            }
//        }

//        for (childMessage in groupedChildMessage) {
//            val parentMessage = groupedByIdParent.forEach() {
//                if (it.key == childMessage.key) {
//                    println("${groupedByIdParent.keys}")
//                }
//            }
//        }

//        println(groupedChildMessage.keys.contains())
        for (parentKey in groupedByIdParent.keys) {
            for (childrenKey in groupedChildMessage.keys) {

                //                println("Дебаг: ${groupedChildMessage[childrenKey]}") // Получаю список объектов по ключу 0
//                println("Дебаг: ${groupedByIdParent[parentKey]}") // Получаю список объектов по ключу 0

                // New да работает, множественное повторение
                if (groupedChildMessage.keys.contains(parentKey)) {

                    groupedByIdParent[parentKey]?.forEach() {
                        println("${it.author}: ${it.text}")
                    }
                    groupedChildMessage[childrenKey]?.forEach() {
                        println("\t${it.author}: ${it.text}")
                    }

                } else {
                    groupedByIdParent[parentKey]?.forEach() {
                        println("${it.author}: ${it.text}")
                    }

                }
            }
        }
        // -----
//                val equalsInChild = groupedByIdParent.keys.find { it.equals(childrenKey) } // можно find и foreach
//                    println(equalsInChild)
//
//
//                if (parentKey == childrenKey) {
//
//                    groupedByIdParent[parentKey]?.forEach() {
//                        println("${it.author}: ${it.text}")
//                    }
//                    groupedChildMessage[childrenKey]?.forEach() {
//                        println("\t${it.author}: ${it.text}")
//                    }
//
//                } else if (childrenKey != parentKey) {
//                    groupedByIdParent[parentKey]?.forEach() {
//                        println("${it.author}: ${it.text}")
//                    }
//                }
//            }
//        }
//      -----
//        if (groupedByIdParent.keys == groupedChildMessage.keys) {
//            groupedByIdParent.keys.forEach() { println(it) }

//        }

//        for (i in groupedByIdParent.keys) {
//            groupedByIdParent[i]?.forEach() { parent ->
//                println("${parent.author}: ${parent.text}")

//                val childMessage = groupedChildMessage.keys.find {  }
//                println(childMessage)
//            }
//            for (iChild in groupedChildMessage.keys) {
//                val threadMessage = groupedChildMessage[iChild]?.find { it.parentMessageId ==  }
//            }
//        }

        // По умолчанию печатать все сообщения, если child par id == parent id печатать тред
//        groupedByIdParent.forEach() {
//                val threadMessage(it.key)
//        }
//        }

        // Сначала проверить есть ли сообщения в треде и печатать сразу с ними если нет, тогда выводить главное сообщение
        // Отложил идею
        //messageList.filter { it.id == it.p }

//        Работает печатает списком как в тз но не группирует

//            messageList.forEach() {
//            if (it !is ChildMessage) {
//                println("${it.author}: ${it.text}")
//            }
//            if (it is ChildMessage) {
//                    //val finer = messageList.find { it.id  }
//                println("\t${it.author}: ${it.text}")
//            }
//        }
// ------     -------
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
    chat.addThreadMessage("ANone", "Привет 3", chat.messageList[0].id)

    chat.addMessage("Dima1", "Привет 2")
    chat.addThreadMessage("ANone", "Привет 3", chat.messageList[1].id)

    chat.printChat()

}
