package lesson17

class Package1 {

    var number: Int = 0

    var location: String = "Старт"
        get() = field
        set(value) {
            displacementCounter++
            field = value
        }

    var displacementCounter: Int = 0

}

fun main() {

    val package1 = Package1()

    println("${package1.number}: ${package1.location}, ${package1.displacementCounter}")

    package1.number = 1
    package1.location = "Изменилось"

    println("${package1.number}: ${package1.location}, ${package1.displacementCounter}")

}
