package lesson10

fun main() {

    val shoppingCart = listOf("Часы кухонные - 1 шт.", "Весы напольные - 1 шт.", "Мешок кондитерский - 2 шт.")

    println("Необходима авторизация! \nВведите логин и пароль")
    val userInputLogin = readln()

    println("Введите пароль: ")
    val userInputPassword = readln()

    if (verifyUser(userInputLogin, userInputPassword) == null) println("Авторизация неуспешна!")
    else shoppingCart.forEach() { println(it) }

}

fun verifyUser(userInputLogin: String, userInputPassword: String): String? =
    if ((userInputLogin == USER_LOGIN) && (userInputPassword == USER_PASSWORD)) tokenGenerate() else null

fun tokenGenerate(): String {
    val chars = listOf(('a'..'z'), ('A'..'Z'), ('0'..'9')).flatten()
    var token = ""

    for (i in 1..32) {
        token += chars.random()
    }

    return token
}

const val USER_LOGIN = "Adam123"
const val USER_PASSWORD = "123qwe"
