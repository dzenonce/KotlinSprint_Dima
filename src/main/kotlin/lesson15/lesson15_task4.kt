package lesson15

interface Search {

    fun searchComponent() {
        println("Выполняется поиск комплектующих")
    }

}

abstract class Commodity {
    abstract val name: String
    abstract val count: Int
}

class MusicalInstrument(
    override val name: String,
    override val count: Int,
) : Commodity(), Search

class Component(
    override val name: String,
    override val count: Int,
) : Commodity()

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