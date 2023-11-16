package lesson2

fun main() {
    val scores = arrayOf(3, 4, 3, 5)

    var totalScore = 0.0

    for (i in scores) {
        totalScore += i
    }

    println(totalScore / scores.size)
}