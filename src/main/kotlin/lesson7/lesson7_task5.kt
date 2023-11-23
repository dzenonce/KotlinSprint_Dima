package lesson7

fun main() {
    println("Укажите максимальную длинну пароля (Минимальная 6): ")
    val maximumPasswordLength = readln().toInt()

    val randomPasswordLength = (MINIMUM_PASSWORD_LENGTH..maximumPasswordLength).random()

    var password = ""

    for (i in 0 until randomPasswordLength) {

        val letters = listOf(('a'..'z'), ('A'..'Z'), (0..9)).flatten().random()

        password += letters
    }

    println(password)
}

const val MINIMUM_PASSWORD_LENGTH = 6