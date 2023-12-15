package lesson18

import kotlin.math.pow

abstract class Box {

    abstract fun calculateArea(): Double

}

class SquareBox(
    private val ribLength: Double,
) : Box() {

    override fun calculateArea() = 6 * ribLength.pow(2)

}

class RectangularBox(
    private val length: Double,
    private val width: Double,
    private val height: Double,
) : Box() {

    override fun calculateArea() = length * width * height

}

fun main() {

    val qubeBox = SquareBox(
        ribLength = 24.2
    )

    val rectangularBox = RectangularBox(
        length = 11.2,
        width = 23.3,
        height = 11.0,
    )

    println(qubeBox.calculateArea())
    println(rectangularBox.calculateArea())

}