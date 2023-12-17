package lesson17

class Quiz(
    private val _question: String,
    private val _responce: String,
) {

    val question = _question
        get() = field

    var responce = _responce
        get() = field
        set(value) {
            field = value
        }


}

fun main() {

    val lot = Quiz(
        _question = "Сколько в среднем весит слон",
        _responce = "5 тонн",
    )

    println("${lot.question}: ${lot.responce}")

}