package lesson12

class DayWeather(dayTemperature: Int, nightTemperature: Int, isPrecipitationInDay: Boolean) {

    init {
        println("Создан объект с параметрами: $dayTemperature, $nightTemperature, $isPrecipitationInDay")
    }

    var anotherVariable = "Условия переменной"
    var twoAnother = "Другие условия"

}

fun main() {

    val day1 = DayWeather(2, 4, true)
    val day2 = DayWeather(1, 3, false)

    day1.anotherVariable = "Другое"
    day1.twoAnother = "Совсем другое"

    day2.anotherVariable = "Другое2"
    day2.twoAnother = "Совсем другое2"



    println(day1.anotherVariable)
    println(day1.twoAnother)

    println(day2.anotherVariable)
    println(day2.twoAnother)


}

