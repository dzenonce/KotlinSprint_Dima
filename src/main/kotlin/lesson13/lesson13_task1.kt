package lesson13

class DataCard(
    val name: String,
    val telNumber: Long,
    val company: String?,
)

fun main() {

    val tel1 = DataCard(
        name = "Дима",
        telNumber = 88005553535,
        company = null,
    )

    println(tel1.name)
    println(tel1.telNumber)
    println(tel1.company)
}