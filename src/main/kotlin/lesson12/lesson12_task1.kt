package lesson12

class DayWeather {

    var dayTemperature = 0.0
    var nightTemperature = 0.0
    var isPrecipitationInDay = false

    fun printWeather() {
        println("Температура днем: $dayTemperature \nТемпература ночью: $nightTemperature \nОсадки: $isPrecipitationInDay")
    }

    var another = "Какое-то значение"

}

fun main() {

    val day1 = DayWeather()
    val day2 = DayWeather()

    day1.dayTemperature = 2.2
    day1.nightTemperature = 3.0
    day1.isPrecipitationInDay = false

    day1.printWeather()

    day1.another = "Гулять можно"
    println(day1.another)

    day2.dayTemperature = 1.2
    day2.nightTemperature = 4.6
    day2.isPrecipitationInDay = true

    println()
    day2.printWeather()

    day2.another = "Гулять нельзя"
    println(day2.another)


}

