package lesson7

fun main() {
    println("Укажите максимальную длинну пароля (Минимальная 6): ")
    val maximumPasswordLength = readln().toInt()

    val randomPasswordLength = (MINIMUM_PASSWORD_LENGTH..maximumPasswordLength).random()

    var password = ""

    for (i in 0 until randomPasswordLength) {
        val randomCharInLowerCase = ('a'..'z').random().toString()
        val randomCharInApperCase = ('A'..'Z').random().toString()
        val randomNumber = (0..9).random().toString()

        val arrayRandomCharset = arrayOf(randomCharInLowerCase, randomCharInApperCase, randomNumber)

        password += arrayRandomCharset.random()
    }

    println(password)
}

const val MINIMUM_PASSWORD_LENGTH = 6