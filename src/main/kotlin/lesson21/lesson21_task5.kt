package lesson21

fun <K, V: Comparable<V>> Map<K, V>.maxCategory() = this.maxByOrNull { it.value }?.key

class Gamer{

    val skills = mapOf(
        "Running" to 10,
        "Jumping" to 25,
        "Stamina" to 25,
    )

}

fun main() {

    val pers = Gamer()

    println(pers.skills.maxCategory())

}