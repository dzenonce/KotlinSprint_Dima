package lesson14

open class Liner_1(
    val type: String = "Лайнер",
    val speed: Int = 100,
    val capacity: Int = 50,
    val passanger: Int = 1000,
) {

    open fun beginLoading() {
        println("$type выдвигает горизонтальный трап со шкафута")
    }

    open fun outputShipProperties() {
        println("""
        -Тип: $type
        -Скорость: $speed
        -Грузоподъемность: $capacity
        -Пассажировместимость: $passanger
           
        """.trimIndent()
        )
    }

}

class Freighter_1(
    type: String = "Грузовой корабль",
    speed: Int = 70,
    capacity: Int = 500,
    passanger: Int = 200,

) : Liner_1(type, speed, capacity, passanger) {

    override fun beginLoading() {
        println("$type активирует погрузочный кран")
    }

}

class Icebreaker_1(
    type: String = "Ледокол",
    speed: Int = 50,
    capacity: Int = 300,
    passanger: Int = 100,
    val isIcePick: Boolean = true,

) : Liner_1(type, speed, capacity, passanger) {

    override fun beginLoading() {
        println("$type открывает ворота со стороны кормы")
    }

    override fun outputShipProperties() {
        println("""
        -Тип: $type
        -Скорость: $speed
        -Грузоподъемность: $capacity
        -Пассажировместимость: $passanger
        -Колет лед: $isIcePick
           
        """.trimIndent()
        )

    }

}

fun main() {

    val liner = Liner_1()
    val freighter = Freighter_1()
    val icebreaker = Icebreaker_1()

    val shipList = listOf(liner, freighter, icebreaker)

    shipList.forEach() { it.outputShipProperties() }

}
