package lesson12

class WeatherDay(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _isPrecipitationInDay: Boolean
) {

    val dayTemperature = _dayTemperature - ZERO_IN_KELVIN
    val nightTemperature = _nightTemperature - ZERO_IN_KELVIN
    val isPrecipitationInDay = _isPrecipitationInDay

    fun printWeather() {
        println("Температура днем: $dayTemperature \nТемпература ночью: $nightTemperature \nОсадки: $isPrecipitationInDay")
    }

}

const val ZERO_IN_KELVIN = 273

fun main() {

    val days = WeatherDay(
        _dayTemperature = 300,
        _nightTemperature = 290,
        _isPrecipitationInDay = true,
    )

    days.printWeather()

}

