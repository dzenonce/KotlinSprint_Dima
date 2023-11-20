package lesson5

fun main() {

    val randomNumberList = List(3) { (0..42).random() }

    println(
        """
    Привет привет! Продолжим нашу захватывающую игру, и сегодня,
    у нас кое-что особенное, мы приготовили для тебя супер-приз! (овации зала)
    Но для этого, тебе необходимо угадать сразу три числа (удивление публики), тогда, ты получишь супер-приз,
    за два отгаданных числа, ты получишь очень крупный приз, ну а за одно отгаданное число, ты получишь утешительный приз.
    Правила ты уже знаешь но напомним еще раз, вводи числа от 0 до 42.
    Ну что ж, приступим!
    """.trimIndent()
    )

    println("Введите первое число: ")
    val userInputNumberOne = readln().toInt()

    println("Введите второе число: ")
    val userInputNumberTwo = readln().toInt()

    println("Введите третье число: ")
    val userInputNumberThree = readln().toInt()

    val userInputs = listOf(userInputNumberOne, userInputNumberTwo, userInputNumberThree)

    val matchesNumber = userInputs.intersect(randomNumberList)

    when (matchesNumber.size) {
        3 -> println("Поздравляю, Вы выиграли супер-приз")
        2 -> println("Вы большой молодец, вы угадали 2 числа из 3-х, вот вам такой же большой приз")
        1 -> println("Отлично, вы угадали ону цифру и получаете утешительный приз")
        else -> println("Неудача")
    }

    println("Загаданные числа: ${randomNumberList[0]}, ${randomNumberList[1]}, ${randomNumberList[2]}")
}