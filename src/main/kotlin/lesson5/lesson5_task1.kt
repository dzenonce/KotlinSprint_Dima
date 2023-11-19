package lesson5

fun main() {

    val firstNumber = (0..10).random()
    val secondNumber = (0..10).random()

    val captchaForUser = "$firstNumber + $secondNumber"

    println("Введите решение уравнения $captchaForUser ")
    val userInput = readln()?.toInt()

    val captcha = firstNumber + secondNumber

    if (userInput == captcha) println("Доступ разрешен")
    else println("Доступ запрещен")
}