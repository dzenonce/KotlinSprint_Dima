package lesson2

const val HourInMinute = 60

fun main() {
    val departTimeHour = 9
    val departTimeMinute = 39

    val travelTimeMinute = 457

    val departTimeHourInMinute = departTimeHour * HourInMinute

    val arrivalTimeInMinute = departTimeHourInMinute + departTimeMinute + travelTimeMinute
    val hourOfArrival = arrivalTimeInMinute / HourInMinute
    val minuteOfArrival = arrivalTimeInMinute % HourInMinute

    println("Время прибытия: $hourOfArrival:$minuteOfArrival")
}