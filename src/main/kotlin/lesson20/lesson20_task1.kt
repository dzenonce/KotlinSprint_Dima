package lesson20

fun main() {

    val username = "Ваня"

    val SplashScreen: () -> String = { "С наступающим Новым Годом, $username!" }

    println(SplashScreen())

}