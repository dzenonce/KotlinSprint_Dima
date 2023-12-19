package lesson20

class Robot {

    private var modifier: (String) -> Unit = { println(it) }

    private val phraseList: List<String> = listOf(
        "Привет! Как я могу помочь вам сегодня?",
        "Интересный вопрос! Дайте мне знать, что вы хотели бы узнать.",
        "Чем могу быть полезен? Задавайте ваши вопросы.",
        "Я здесь, чтобы помочь вам. Что вы хотели бы обсудить?",
        "Понимаю. Расскажите мне подробнее о вашем запросе.",
    )

    fun say() = modifier(phraseList.random())

    fun setModifier(_modifier: (String) -> Unit) {
        modifier = _modifier
    }

}

fun main() {

    val robotToto = Robot()

    robotToto.say()

    val reversModifier: (String) -> Unit = { toRevers: String ->
        println(toRevers.split("").reversed().joinToString(""))
    }

    robotToto.setModifier(reversModifier)

    robotToto.say()

}