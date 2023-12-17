package lesson17

class Package1(
    private val number: Int,
    private val _location: String,
    private var displacementCounter: Int = 0,
) {

    var location: String = _location
        set(value) {
            displacementCounter++
            field = value
        }

    fun printPackageInfo() {
        println("Номер заказа: ${number}: ${location}, ${displacementCounter}")
    }

}

fun main() {

    val package1 = Package1(
        number = 1,
        _location = "Одинцовский район",
    )

    package1.printPackageInfo()

    package1.location = "Изменилось"

    package1.printPackageInfo()

}
