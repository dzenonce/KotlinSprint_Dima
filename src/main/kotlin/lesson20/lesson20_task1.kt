package lesson20

fun main() {

    val username = "Ваня"

    val splashScreen: () -> String = { "С наступающим Новым Годом, $username!" }

    println(splashScreen())

}