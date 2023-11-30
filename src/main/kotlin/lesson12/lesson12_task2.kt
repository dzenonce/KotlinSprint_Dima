package lesson12

class WeatherInDay(val dayTemperature: Double, val nightTemperature: Double, val isPrecipitationInDay: Boolean) {

    fun printWeather() {
        println("Температура днем: $dayTemperature \nТемпература ночью: $nightTemperature \nОсадки: $isPrecipitationInDay")
    }

}

fun main() {

    val day = WeatherInDay(22.5, 12.4, false)
    day.printWeather()

}
