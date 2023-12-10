package lesson17

class Quiz {

    var question: String = ""
        get() = field
        set(value) {
            field = value
        }

    var responce: String = ""
        set(value) {
            field = value
        }

}

fun main() {

    val lot = Quiz()

    lot.question = "Вопрос"
    lot.responce = "Ответ"

    println("${lot.question}: ${lot.responce}")

}