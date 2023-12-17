package lesson19

enum class Gender(
    val gender: String,
) {

    MALE("Мужской"),
    FEMALE("Женский"),
    ERROR("Неизвестные данные");

}

class Human(
    val name: String,
    val gender: Gender,
)

fun main() {

    val listHuman: MutableList<Human> = mutableListOf()

    println("Введите имя, и пол (М/Ж) \nПосле ввода параметра нажмите enter")

    do {
        println("Имя:")
        val name = readln()

        println("Пол:")
        val gender = getGender(readln())

        listHuman.add(Human(name, gender))

    } while (listHuman.size < 5)

    listHuman.forEach() { println("${it.name}: ${it.gender.gender}") }

}

fun getGender(userInput: String): Gender {
    return when (userInput) {
        "М" -> Gender.MALE
        "Ж" -> Gender.FEMALE
        else -> Gender.ERROR
    }
}