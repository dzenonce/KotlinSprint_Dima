package lesson17

class Ship {

    var name: String = "Shipper"
        get() = field
        set(value) {
            println("Данное поле меньять нельзя")
        }

    var averageSpeed: Double = 0.0

    var homePort: String = "Silent Harbor"

}

fun main() {

    val ship = Ship()

    println(ship.name)

    ship.name = "Go Home"

}