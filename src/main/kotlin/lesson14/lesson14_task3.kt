package lesson14

import kotlin.math.PI

abstract class Figure(
    val color: String,
) {

    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double

}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {

    override fun calculateArea(): Double = (PI * radius) * 4

    override fun calculatePerimeter(): Double = (PI * radius) * 2

}


class Rectangle(
    color: String,
    val weigt: Double,
    val heigt: Double,
) : Figure(color) {

    override fun calculateArea(): Double = weigt * heigt

    override fun calculatePerimeter(): Double = (weigt + heigt) * 2

}

fun main() {

    val circle1 = Circle(WHITE_COLOR, 4.0)
    val rectangle1 = Rectangle(WHITE_COLOR, 3.0, 4.0)

    val circle2 = Circle(BLACK_COLOR, 6.0)
    val rectangle2 = Rectangle(BLACK_COLOR, 2.0, 7.0)

    val figureList = listOf(circle1, rectangle1, circle2, rectangle2)

    var sumAreaWhite = 0.0
    var sumPerimeterBlack = 0.0

    figureList.forEach() {
        if (it.color.equals(WHITE_COLOR, ignoreCase = true))
            sumAreaWhite += it.calculateArea()
        else if (it.color.equals(BLACK_COLOR, ignoreCase = true))
            sumPerimeterBlack += it.calculatePerimeter()
    }

    println("Сумма периметров всех черных фигур: $sumPerimeterBlack")
    println("Сумма площадей всех белых фигур: ${sumAreaWhite}")

}

const val WHITE_COLOR = "Белый"
const val BLACK_COLOR = "Черный"