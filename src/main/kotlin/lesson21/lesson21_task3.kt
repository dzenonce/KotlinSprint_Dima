package lesson21

fun Player.isHealthy() : Boolean {
    return when(currentHealth) {
        maxHealth -> true
        else -> false
    }
}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun main() {

    val pers = Player(
        name = "Julian",
        currentHealth = 10,
        maxHealth = 100,
    )

    println(pers.isHealthy())

}

