package lesson13

class ContactCard(
    val name: String,
    val tel: Long?,
    var company: String? = null,
) {

    fun printInfo() {
        println("Имя: $name \nТелефон: $tel \nКомпания: $company\n")
    }

}

fun main() {

    val contactList: MutableList<ContactCard> = mutableListOf()

    while (true) {

        println("Введите Имя (или стоп, для остановки):")
        val name = readln()

        if (name.equals("стоп", ignoreCase = true)) break

        println("Введите номер телефона:")
        val tel = readln()?.toLongOrNull()

        if (tel == null) {
            println("Поле не может быть пустым")
            continue
        }

        println("Введите название компании (Можно пропустить, нажав enter):")
        val company = readln().takeIf { it.isNotBlank() }

        contactList.add(ContactCard(name, tel, company))

    }

    contactList.forEach() { it.printInfo() }

}
