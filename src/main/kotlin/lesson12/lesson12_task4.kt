package lesson12

class WeatherIn(var dayTemperature: Int, var nightTemperature: Int, var isPrecipitationInDay: Boolean) {

    init {
        println("Объект создан \nТемпература днем: ${ dayTemperature - 273 } \nТемпература ночью: ${ nightTemperature - 273 } \nОсадки: $isPrecipitationInDay")
    }

}

fun main() {

    val dayWeather = WeatherIn(300, 270, false)

}
