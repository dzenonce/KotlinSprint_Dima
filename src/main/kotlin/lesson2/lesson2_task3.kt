package lesson2

const val HOUR_IN_MINUTE = 60

fun main() {
    val departTimeHour = 9
    val departTimeMinute = 39

    val travelTimeMinute = 457

    val departTimeHourInMinute = departTimeHour * HOUR_IN_MINUTE

    val arrivalTimeInMinute = departTimeHourInMinute + departTimeMinute + travelTimeMinute
    val hourOfArrival = arrivalTimeInMinute / HOUR_IN_MINUTE
    val minuteOfArrival = arrivalTimeInMinute % HOUR_IN_MINUTE

    println("Время прибытия: $hourOfArrival:$minuteOfArrival")
}