package lesson4

const val TABLES_IN_RESTAUARANT = 13

fun main() {
    val todayOccupedTable = 13
    val tomorrowOccupedTable = 9

    val todayAvailableTables = todayOccupedTable != TABLES_IN_RESTAUARANT
    val tomorrowAvailableTables = tomorrowOccupedTable != TABLES_IN_RESTAUARANT

    println("Доступность столиков на сегодня: $todayAvailableTables \nДоступность столиков на завтра: $tomorrowAvailableTables")
}