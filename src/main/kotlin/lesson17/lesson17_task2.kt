package lesson17

class Ship(
    private val _name: String,
    val averageSpeed: Int,
    val homePort: String,
) {

    var name: String = _name
        get() = field
        set(value) {
            println("Данное поле менять нельзя")
        }

}

fun main() {

    val ship = Ship(
        _name = "SpeedBoat",
        averageSpeed = 55,
        homePort = "Silent Home",
    )

    println(ship.name)

    ship.name = "Go Home"

}