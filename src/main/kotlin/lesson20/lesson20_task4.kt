package lesson20

fun main() {

    val elementList = listOf("Element1", "SomeElement2", "Some3", "Socks5", "ProxyList")

    val lambdList = elementList.map { { println("Нажат элемент $it") } }

    lambdList.forEachIndexed { index, function ->
        if (index % 2 == 0) function()
    }

}
