package lesson5

import kotlin.random.Random

fun main() {

    val firstNumber = Random.nextInt(0, 10)
    val secondNumber = Random.nextInt(0, 10)

    val captchaForUser = "$firstNumber + $secondNumber"

    println("Введите решение уравнения $captchaForUser ")
    val userInput = readLine()!!.toInt()

    val captcha = firstNumber + secondNumber

    if (userInput == captcha) println("Доступ разрешен")
    else println("Доступ запрещен")
}