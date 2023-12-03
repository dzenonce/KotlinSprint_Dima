package lesson14

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

    val circle1 = Circle("Белый", 4.0)
    val rectangle1 = Rectangle("Белый", 3.0, 4.0)

    val circle2 = Circle("Черный", 6.0)
    val rectangle2 = Rectangle("Черный", 2.0, 7.0)

    val whiteFigure = listOf(circle1, rectangle1)
    val blackFigure = listOf(circle2, rectangle2)

    val sumAreaWhite = whiteFigure.sumOf { it.calculateArea() }
    val sumPerimeterBlack = whiteFigure.sumOf { it.calculatePerimeter() }

    println("Сумма периметров всех черных фигур: $sumPerimeterBlack")
    println("Сумма площадей всех белых фигур: $sumAreaWhite")

}

const val PI = 3.14

