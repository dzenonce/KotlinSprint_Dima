package lesson20

fun main() {

    val elementList = listOf("Element1", "SomeElement2", "Some3", "Socks5", "ProxyList")

    val lambdList: MutableList<() -> Unit> = mutableListOf()

    elementList.map {
        val lambda: () -> Unit = { println("Нажат элемент $it") }
        lambdList.add(lambda)
    }

    val evenElements = lambdList.filterIndexed { index, i -> index % 2 == 0 }
    evenElements.forEach { it() }
}
