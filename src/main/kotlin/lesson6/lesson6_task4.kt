package lesson6

fun main() {
    val gameNumber = (0..9).random()
    var attempNumber = 5

    println(gameNumber)

    println("Привет, в этой игре тебе нужно угадать загаданное число от 0 - 9, у тебя $attempNumber попыток, погнали!")

    while (attempNumber > 0) {
        val userChoise = readln().toInt()

        if (userChoise == gameNumber) {
            println("Это была великолепная игра!")
            return
        } else println("Вы не угадали, у вас осталось ${--attempNumber} попыток!")

    }

    println("Было загадано число $gameNumber")
}