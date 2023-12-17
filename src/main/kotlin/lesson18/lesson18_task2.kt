package lesson18

abstract class Dice {

    abstract fun rollDice1()

}

class DiceEightFacets : Dice() {

    override fun rollDice1() {
        println("Кость с 8-ю гранями: ${(1..8).random()}")
    }

}

class DiceSixFacets : Dice() {

    override fun rollDice1() {
        println("Кость с 6-ю гранями: ${(1..6).random()}")
    }

}

class DiceFourFacets : Dice() {

    override fun rollDice1() {
        println("Кость с 4-я гранями: ${(1..4).random()}")
    }

}

fun main() {

    val eightFacets = DiceEightFacets()
    val sixFacets = DiceSixFacets()
    val fourFacets = DiceFourFacets()

    val diceList = listOf<Dice>(eightFacets, sixFacets, fourFacets)

    diceList.forEach { it.rollDice1() }

}