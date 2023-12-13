package lesson18

abstract class RollDiceGame {

    abstract fun rollDice()

}

class DiceEightFacets : RollDiceGame() {

    override fun rollDice() {
        println("Кость с 8-ю гранями: ${(1..8).random()}")
    }

}

class DiceSixFacets : RollDiceGame() {

    override fun rollDice() {
        println("Кость с 6-ю гранями: ${(1..6).random()}")
    }

}

class DiceFourFacets : RollDiceGame() {

    override fun rollDice() {
        println("Кость с 4-я гранями: ${(1..4).random()}")
    }

}

fun main() {

    val eightFacets = DiceEightFacets()
    val sixFacets = DiceSixFacets()
    val fourFacets = DiceFourFacets()

    val diceList = listOf<RollDiceGame>(eightFacets, sixFacets, fourFacets)

    diceList.forEach { it.rollDice() }

}