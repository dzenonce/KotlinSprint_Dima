package lesson2

fun main() {
    val departTimeHour = 9
    val departTimeMinute = 39

    val travelTimeMinute = 457

    val departTimeHourInMinute = departTimeHour * 60

    val arrivalTimeInMinute = departTimeHourInMinute + departTimeMinute + travelTimeMinute
    val hourOfArrival = arrivalTimeInMinute / 60
    val minuteOfArrival = arrivalTimeInMinute % 60

    println("Время прибытия: $hourOfArrival:$minuteOfArrival")
}