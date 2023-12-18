package lesson22

class RegularBook1(
    val name: String,
    val author: String,
)

data class DataBook1(
    val name: String,
    val author: String,
)

fun main() {

    val regBook = RegularBook1(
        name = "Под куполом",
        author = "Стивен Кинг",
    )

    // Здесь выводится объект, хранящийся по ссылке, т.е экземпляр класса
    println(regBook)

    val dataBook = DataBook1(
        name = "КлиТбище домашних жЫвотных",
        author = "Стивен Кинг",
    )

    // При выводе дата класса, выводятся значения, хранящиеся в классе
    println(dataBook)

}
