package lesson16

class GameCharacter(
    val name: String,
    private var healt: Int = 100,
    var damage: Int,
) {

    fun takeDamage(player: GameCharacter) {

        healt -= player.damage

        println("$name, получает удар от ${player.name} \n Уровень здоровья: $healt")
        if (healt <= 0) diedCharacter()
    }

    fun heal() {

        when (healt) {
            100 -> println(" $name, лечиться не нужно")
            0 -> println(" $name, лечиться уже поздно")
            else -> {
                healt += 10
                println(" $name, лечится на +10 \n Здоровье: ${healt}")
            }
        }

    }

    private fun diedCharacter() {

        damage = 0
        healt = 0

        println("$name погиб ;..;")

    }
}

fun main() {

    val subzero = GameCharacter(
        name = "Subzero",
        damage = 15,
    )

    val mordovorot = GameCharacter(
        name = "Mordovorot",
        damage = 30,
    )

    mordovorot.heal()

    subzero.takeDamage(mordovorot)
    subzero.heal()

    mordovorot.takeDamage(subzero)
    mordovorot.takeDamage(subzero)

    subzero.takeDamage(mordovorot)
    subzero.takeDamage(mordovorot)
    subzero.takeDamage(mordovorot)
    subzero.heal()

}
