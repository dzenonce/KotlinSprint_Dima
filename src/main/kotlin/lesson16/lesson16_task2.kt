package lesson16

import kotlin.math.pow

class CircleTwo(
    private val radius: Double,
) {

    fun calculateCircle() {
        println(2 * PI * radius)
    }

    fun calculateArea() {
        println(PI * radius.pow(2))
    }

}

fun main() {

    val circle = CircleTwo(
        radius = 5.4,
    )

    circle.calculateCircle()

    circle.calculateArea()

}

private const val PI = 3.14