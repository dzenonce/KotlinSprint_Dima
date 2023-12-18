package lesson22

data class Fryer(
    val name: String,
    val model: String,
    val serialNumber: Long,
)

fun main() {

    val fryer = Fryer(
        name = "Bosch",
        model = "6l",
        serialNumber = 34723798347,
    )

    val (name, model, serialNumber) = fryer

    println(name)
    println(model)
    println(serialNumber)

}