package lesson19

enum class Fishs(
    val type: String,
) {

    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),

}

fun main() {

    println("В аквариуме есть следующие рыбы:")
    Fishs.entries.forEach() { println(it.type)}

}