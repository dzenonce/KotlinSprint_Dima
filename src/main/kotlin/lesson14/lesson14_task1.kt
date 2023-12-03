package lesson14

open class Liner(
    val type: String = "Лайнер",
    val speed: Int = 100,
    val capacity: Int = 50,
    val passanger: Int = 1000,
)

class Freighter(
    type: String = "Грузовой корабль",
    speed: Int = 70,
    capacity: Int = 500,
    passanger: Int = 200,

) : Liner(type, speed, capacity, passanger)

class Icebreaker(
    type: String = "Ледокол",
    speed: Int = 50,
    capacity: Int = 300,
    passanger: Int = 100,
    val isIcePick: Boolean = true,

) : Liner(type, speed, capacity, passanger)

fun main() {

    val liner = Liner()
    val freighter = Freighter()
    val icebreaker = Icebreaker()

}