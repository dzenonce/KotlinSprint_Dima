package lesson13

class ContactCard1(
    val name: String,
    val tel: Long,
    var company: String? = null,
)

fun main() {

    println("Введите Имя")
    val name = readln()

    println("введите телефон")
    val tel = try {
        readln()?.toLong()
    } catch (e: NumberFormatException) {
        println(e)
    }

}