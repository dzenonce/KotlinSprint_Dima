package lesson16

class Order(
    val number: Int,
    private var status: String,
) {

    fun sendRequestManager(newStatus: String) = changeStatus(newStatus)

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun printOrderInfo() {
        println("$number: $status")
    }

}

fun main() {

    val order1 = Order(
        number = 1,
        status = "Ожидание",
    )

    order1.printOrderInfo()

    order1.sendRequestManager("Готово")

    order1.printOrderInfo()

}