package lesson12

class WeatherDay() {

    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var isPrecipitationInDay: Boolean = false

    fun printWeather() {
        println("Температура днем: ${ dayTemperature - 273 } \nТемпература ночью: ${ nightTemperature - 273 } \nОсадки: $isPrecipitationInDay")
    }

}

fun main() {

    val days = WeatherDay().apply {
        dayTemperature = 300
        nightTemperature = 290
    }

    days.printWeather()

}
