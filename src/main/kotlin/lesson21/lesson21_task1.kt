package lesson21

fun String.vowelCount(): Int {

    val vowels = "aeiouyAEIOUY"
    return count { vowels.contains(it) }

}

fun main() {

    println("Hello".vowelCount())

}