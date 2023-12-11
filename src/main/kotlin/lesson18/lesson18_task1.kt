package lesson18

open class Crm {

    open fun getOrderInfo() = ""

}

class Item(
    private val orderNumber: Int,
    private val item: String,
) : Crm() {

    override fun getOrderInfo(): String {
        return "Заказан товар: $item"
    }

}

class SeveralItems(
    private val orderNumber: Int,
    private val item: List<String>,
) : Crm() {

    override fun getOrderInfo(): String {
        return "Заказаны следующие товары: $item"
    }

}

fun main() {

    val item1 = Item(
        orderNumber = 1,
        item = "Cat eat",
    )

    val item2 = SeveralItems(
        orderNumber = 1,
        item = listOf("Cat eat", "Dogs eat", "Phone"),
    )

    val orderList: Array<Crm> = arrayOf(item1, item2)

    orderList.forEach { println(it.getOrderInfo()) }

}