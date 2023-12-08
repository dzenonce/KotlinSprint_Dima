package lesson15

interface Search {

    fun searchComponent() {
        println("Выполняется поиск комплектующих")
    }

}

abstract class Commodity(
    val name: String,
    val count: Int,
)

class MusicalInstrument(
    name: String,
    count: Int,
) : Commodity(name, count), Search

class Component(
    name: String,
    count: Int,
) : Commodity(name, count)

fun main() {

    val guitar = MusicalInstrument(
        name = "Crafter STG-27-CE",
        count = 1,
    )

    val string = Component(
        name = "Elixir",
        count = 20,
    )

    guitar.searchComponent()

}