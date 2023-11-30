package lesson13

class Contact(
    val name: String,
    val telNumber: Long,
    var company: String? = null,
) {

}

fun main() {

    val contact1 = Contact(name = "Ростислав", telNumber = 89123456789, company = "Reddit")
    val contact2 = Contact(name = "Лорд", telNumber = 89123456789, company = "null")
    val contact3 = Contact(name = "Ростик", telNumber = 89123456789, company = "Red")
    val contact4 = Contact(name = "Рандомный Чел", telNumber = 89123456789, company = null)
    val contact5 = Contact(name = "Из Ниоткуда", telNumber = 89123456789, company = null)


    val contactList: List<Contact> = listOf(contact1, contact2, contact3, contact4, contact5)

    println(contactList.mapNotNull { it.company }.joinToString())

}