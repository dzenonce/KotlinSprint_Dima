package lesson10

fun main() {

    var roundNumber = 0
    var humanWons = 0

    do {
        println("Добро пожаловать в игру! Раунд ${++roundNumber}.")

        val humanDice = rollDice()
        println("Человек бросил кости! Результат: $humanDice")

        val machineDice = rollDice()
        println("Машина бросила кости! Результат: $machineDice\n")

        val whoWon = roundResult(humanDice, machineDice)
        if (whoWon == "Человек") {
            println("Человек победил!")
            humanWons++
        } else if (whoWon == "Машина") println("Победила машина!")
        else println("Ничья!")

        println("\nХотите продолжить? Да/Нет")

        val isWantToCountnue =
            if (readln().equals("да", false)) true
            else false
    } while (isWantToCountnue)

    println("\nЧеловек победил в $humanWons раундах из $roundNumber")
}

fun rollDice(): Int = (1..6).random()

fun roundResult(humanDice: Int, machineDice: Int): String {
    val whoWon =
        if (humanDice > machineDice) "Человек"
        else if (humanDice < machineDice) "Машина"
        else "Ничья"

    return whoWon
}