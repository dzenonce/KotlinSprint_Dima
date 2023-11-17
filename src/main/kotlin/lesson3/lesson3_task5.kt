package lesson3

fun main() {
    val userMove = "D2-D4;0"

    val splitUserMove = userMove.split("-", ";")

    val moveFrom = splitUserMove[0]
    val moveTo = splitUserMove[1]
    val stepNumber = splitUserMove[2]

    println("Ход из: $moveFrom")
    println("Ход на: $moveTo")
    println("Номер хода: $stepNumber")

}
