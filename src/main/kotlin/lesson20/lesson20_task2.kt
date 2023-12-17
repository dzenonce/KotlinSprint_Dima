package lesson20

class Personage(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
) {

    fun printPersonageInfo() {
        println("""
            Имя: $name
            Текущее здоровье: $currentHealth
        """.trimIndent())
    }

}

fun main() {

    val healingPotion: (Personage) -> Unit = { pers: Personage ->
        pers.currentHealth = pers.maxHealth
    }

    val pers = Personage(
        name = "LordOne",
        currentHealth = 10,
        maxHealth = 100,
    )

    pers.printPersonageInfo()

    healingPotion(pers)

    pers.printPersonageInfo()

}