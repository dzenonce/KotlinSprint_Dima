package lesson18

open class Screen {

    fun draw(figure: LapInt) {
        println("Нарисован круг: x - ${figure.x} y - ${figure.y}")
    }

    fun draw(figure: LapDouble) {
        println("Нарисован круг: x - ${figure.x} y - ${figure.y}")
    }

    fun draw(figure: SquareInt) {
        println("Нарисован квадрат: x - ${figure.x} y - ${figure.y}")
    }

    fun draw(figure: SquareDouble) {
        println("Нарисован квадрат: x - ${figure.x} y - ${figure.y}")
    }

    fun draw(figure: PointInt) {
        println("Нарисована точка: x - ${figure.x} y - ${figure.y}")
    }

    fun draw(figure: PointDouble) {
        println("Нарисована точка: x - ${figure.x} y - ${figure.y}")
    }

}

class LapInt(
    val x: Int,
    val y: Int,
) : Screen()

class LapDouble(
    val x: Double,
    val y: Double,
) : Screen()

class SquareInt(
    val x: Int,
    val y: Int,
) : Screen()

class SquareDouble(
    val x: Double,
    val y: Double,
) : Screen()

class PointInt(
    val x: Int,
    val y: Int,
) : Screen()

class PointDouble(
    val x: Double,
    val y: Double,
) : Screen()

fun main() {

    val screen = Screen()

    val lap = LapInt(4, 3)
    val lap1 = LapDouble(3.4, 2.4)

    screen.draw(lap)
    screen.draw(lap1)

}