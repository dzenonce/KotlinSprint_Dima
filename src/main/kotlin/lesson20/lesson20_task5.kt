package lesson20

class Robot {

    private val phraseList: List<String> = listOf(
        "Привет! Как я могу помочь вам сегодня?",
        "Интересный вопрос! Дайте мне знать, что вы хотели бы узнать.",
        "Чем могу быть полезен? Задавайте ваши вопросы.",
        "Я здесь, чтобы помочь вам. Что вы хотели бы обсудить?",
        "Понимаю. Расскажите мне подробнее о вашем запросе.",
    )

    private fun say() = phraseList.random()

    fun setModifier(lambda: (String) -> Unit) {
        lambda(say())
    }

}

fun main() {

    val robotToto = Robot()

    val emptyModifier: (String) -> Unit = {string: String ->
        println(string)
    }

    robotToto.setModifier(emptyModifier)

    val reversModifier: (String) -> Unit = { toRevers: String ->
        println(toRevers.split("").reversed().joinToString(""))
    }

    robotToto.setModifier(reversModifier)

}