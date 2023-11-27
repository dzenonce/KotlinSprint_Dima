package lesson10

fun main() {

    val humanDice = rollDice()
    println("Человек бросает кость, результат $humanDice")

    val robotDice = rollDice()
    println("Робот бросает кость, результат $robotDice")

    val gameResult = if (humanDice > robotDice) "Человек победил!"
    else if (humanDice < robotDice) "Машина победила!"
    else "Ничья!"

    println(gameResult)
}

fun rollDice(): Int = (1..6).random()