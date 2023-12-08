package lesson16

class CircleTwo(
    private val radius: Double,
) {

    private val pi = 3.14

    fun calculateCircle() {
        println((2 * pi) * radius)
    }

    fun calculateArea() {
        println((pi * radius) * radius)
    }

}

fun main() {

    val circle = CircleTwo(
        radius = 5.4,
    )

    circle.calculateCircle()

    circle.calculateArea()

}

