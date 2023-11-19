package lesson5

fun main() {

    val gameNumberOne = (0..42).random()
    val gameNumberTwo = (0..42).random()

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
    val userNumberOne = readln()?.toInt()

    println("Отлично! Теперь введи второе число и нажми Enter")
    val userNumberTwo = readln()?.toInt()

    if ((userNumberOne == gameNumberOne) && (userNumberTwo == gameNumberTwo) || (userNumberOne == gameNumberTwo) && (userNumberTwo == gameNumberOne))
        println("Поздравляем! Вы выиграли главный приз!")
    else if ((userNumberOne == gameNumberOne) || (userNumberOne == gameNumberTwo) || (userNumberTwo == gameNumberTwo) || (userNumberTwo == gameNumberOne))
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")

    println("Для победы нужны были числа $gameNumberOne и $gameNumberTwo")
}