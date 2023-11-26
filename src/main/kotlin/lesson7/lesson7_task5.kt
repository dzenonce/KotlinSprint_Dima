package lesson7

fun main() {

    println("Укажите максимальную длинну пароля (Минимальная 6): ")
    var maximumPasswordLength = readln().toInt()

    while (maximumPasswordLength < MINIMUM_PASSWORD_LENGTH) maximumPasswordLength = readln().toInt()

    val randomPasswordLength = (MINIMUM_PASSWORD_LENGTH..maximumPasswordLength).random()

    var password = ""

    val letters = listOf(('a'..'z'), ('A'..'Z'), (0..9)).flatten()

    for (i in 0 until randomPasswordLength) {
        password += letters.random()
    }

    println(password)
}

const val MINIMUM_PASSWORD_LENGTH = 6