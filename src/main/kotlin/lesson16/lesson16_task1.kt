package lesson16

class Dice(
    private val randomNumber: Int = (1..6).random(),
) {

    fun getDiceNumber() {
        println(randomNumber)
    }

}

fun main() {

    val dice = Dice()

    dice.getDiceNumber()

}
