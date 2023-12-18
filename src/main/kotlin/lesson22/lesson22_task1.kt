package lesson22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main() {

    val regBook = RegularBook(
        name = "Под куполом",
        author = "Стивен Кинг",
    )

    val regBook2 = RegularBook(
        name = "Под куполом",
        author = "Стивен Кинг",
    )

    // При сравнении 2-х обычных классов, сравниваются ссылки на класс, поэтому результат false
    println(regBook == regBook2)

    val dataBook = DataBook(
        name = "КлиТбище домашних жЫвотных",
        author = "Стивен Кинг",
    )

    val dataBook2 = dataBook.copy()

    // При сравнении двух дата классов, сравниваются данные внутри класса, результат true
    println(dataBook == dataBook2)

}