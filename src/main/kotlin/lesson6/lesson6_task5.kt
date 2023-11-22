package lesson6

fun main() {

    var attemptsNumber = 3

    while (attemptsNumber > 0) {
        val captchaRandomNumber = List(2) { (0..9).random() }
        val correctCaptchaSolution = captchaRandomNumber[0] + captchaRandomNumber[1]

        println("Пожалуйста, решите каптчу ${captchaRandomNumber[0]} + ${captchaRandomNumber[1]}")
        val userCaptchaSolution = readln().toInt()

        if (userCaptchaSolution == correctCaptchaSolution) {
            println("Добро пожаловать!")
            return
        } else {
            println("У вас осталось ${--attemptsNumber} попыток")
        }

    }
    println("Доступ запрещен!")

}
