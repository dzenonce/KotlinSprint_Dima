package lesson10

fun main() {

    var roundNumber = 0
    var humanWons = 0

    do {
        println("Добро пожаловать в игру! Раунд ${++roundNumber}.")

        val humanRice = riceRoll()
        println("Человек бросил кости! Результат: $humanRice")

        val machineRice = riceRoll()
        println("Машина бросила кости! Результат: $machineRice\n")

        val whoWon = roundResult(humanRice, machineRice)
        if (whoWon == "Человек") {
            println("Человек победил!")
            humanWons++
        } else if (whoWon == "Машина") println("Победила машина!")
            else println("Ничья!")

        println("\nХотите продолжить? Да/Нет")
        val userContinue = readln()

        val isWantToCountnue =
            if (userContinue.toLowerCase() == "да") true
            else false
    } while (isWantToCountnue)

    println("\nЧеловек победил в $humanWons раундах из $roundNumber")
}

fun riceRoll(): Int = (1..6).random()

fun roundResult(humanRice: Int, machineRice: Int): String {
    val whoWon =
        if (humanRice > machineRice) "Человек"
        else if (humanRice < machineRice) "Машина"
        else "Ничья"

    return whoWon
}