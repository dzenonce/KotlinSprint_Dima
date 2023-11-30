package lesson13

class Card(
    val name: String,
    val telNumber: Long,
    var company: String? = null,
) {

    fun printContactInfo() {
        if (company == null) company = "<не указано>"

        println("-Имя: $name \n-Номер: $telNumber \n-Компания: $company")

    }

}

fun main() {

    val contact1 = Card(name = "Ростислав", telNumber = 89123456789, company = "Reddit")
    contact1.printContactInfo()
    println()
    val contact2 = Card(name = "Ростислав", telNumber = 89123456789, company = null)
    contact2.printContactInfo()

}
