package lesson5

import kotlin.random.Random

fun main() {

    val gameNumberOne = Random.nextInt(0, 43)
    val gameNumberTwo = Random.nextInt(0, 43)

    println(
        """
        Приветствую тебя в игре Угадай число.
        ----------------------------------------
        Если ты угадаешь два числа, загаданных компьютером, то ты получишь главный приз!
        Если угадаешь одно из чисел, получишь утешительный приз ;(
        -----------------------------------------------------------
        Тебе необходимо ввести два числа от 0 до 42 (включительно) в разных строках
        Поехали, введи первое число и нажми Enter
    """.trimIndent()
    )
    val userNumberOne = readLine()!!.toInt()

    println("Отлично! Теперь введи второе число и нажми Enter")
    val userNumberTwo = readLine()!!.toInt()

    if ((userNumberOne == gameNumberOne) && (userNumberTwo == gameNumberTwo) || (userNumberOne == gameNumberTwo) && (userNumberTwo == gameNumberOne))
        println("Поздравляем! Вы выиграли главный приз!")
    else if ((userNumberOne == gameNumberOne) || (userNumberOne == gameNumberTwo) || (userNumberTwo == gameNumberTwo) || (userNumberTwo == gameNumberOne))
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")

    println("Для победы нужны были числа $gameNumberOne и $gameNumberTwo")
}