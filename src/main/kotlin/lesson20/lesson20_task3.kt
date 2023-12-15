package lesson20

class Personage1(
    val name: String,
    var hasAKey: Boolean = false,
)

fun main() {

    val key: (Personage1) -> Unit = { pers: Personage1 ->
        pers.hasAKey = true
        println("${pers.name} нашел ключ")
    }

    val openTheDoor: (Personage1) -> Unit = { pers: Personage1 ->
        when (pers.hasAKey) {
            false -> println("Дверь заперта")
            true -> println("${pers.name} открыл дверь")
        }
    }

    val pers = Personage1(
        name = "SomePers",
    )

    openTheDoor(pers)

    key(pers)
    
    openTheDoor(pers)

}
