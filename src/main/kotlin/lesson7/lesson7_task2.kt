package lesson7

fun main() {

    do {
        val smsCode = (1000..9999).random()

        println("Ваш код авторизации: $smsCode\n")

        println("Введите ваш код:")
        val userInputCode = readln().toInt()

    } while (userInputCode != smsCode)

    println("Авторизация успешна!")
}