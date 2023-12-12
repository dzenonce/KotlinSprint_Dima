package lesson18

class Screen {

    fun draw(x: Int, y: Int, figure: Figure1) {
        println("Нарисован объект в ${figure.name} координатах x: $x, y: $y")
    }

    fun draw(x: Double, y: Double, figure: Figure1) {
        println("Нарисован объект в ${figure.name} координатах x: $x, y: $y")
    }

}

abstract class Figure1(
    val name: String,
)

class Lap(
    name: String = "Круг",
) : Figure1(name)

class Square(
    name: String = "Квадрат",
) : Figure1(name)

class Point(
    name: String = "Точка",
) : Figure1(name)

fun main() {

    val screen = Screen()

    screen.draw(1, 2, Lap())
    screen.draw(1.3, 2.5, Point())

}