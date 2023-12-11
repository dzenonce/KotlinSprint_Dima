package lesson18

import kotlin.math.pow

class Box {

    fun createBox(_ribLength: Double): SquareBox {
        return SquareBox(
            ribLength = _ribLength,
        )
    }

    fun createBox(_length: Double, _width: Double, _height: Double): RectangularBox {
        return RectangularBox(
            length = _length,
            width = _width,
            height = _height,
        )
    }

    fun calculateArea(parcel: SquareBox) = 6 * parcel.ribLength.pow(2)

    fun calculateArea(parcel: RectangularBox) = parcel.length * parcel.width * parcel.height

}

class SquareBox(
    val ribLength: Double,
)

class RectangularBox(
    val length: Double,
    val width: Double,
    val height: Double,
)

fun main() {

    val box = Box()

    val qubeBox = box.createBox(
        _ribLength = 24.2
    )

    val rectangularBox = box.createBox(
        _length = 11.2,
        _width = 23.3,
        _height = 11.0,
    )

    println(box.calculateArea(qubeBox))
    println(box.calculateArea(rectangularBox))

}