package lesson18

open class Crm {

    fun addOrder(id: Int, item: String): Crm {
        return Order(id, item)
    }

    fun addOrder(id: Int, item: List<String>): Crm {
        return Order2(id, item)
    }

    open fun printOrderInfo() {}

}

class Order(
    private val id: Int,
    private val item: String,
) : Crm() {

    override fun printOrderInfo() {
        println("Заказан товар: $item")
    }

}

class Order2(
    private val id: Int,
    private val item: List<String>,
) : Crm() {

    override fun printOrderInfo() {
        println("Заказаны следующие товары: $item")
    }

}

fun main() {

    val crm = Crm()

    val order1 = crm.addOrder(
        id = 1,
        item = "Помидорка"
    )

    val order2 = crm.addOrder(
        id = 2,
        item = listOf("Носки", "Шлепки")
    )

    order1.printOrderInfo()

    order2.printOrderInfo()

}