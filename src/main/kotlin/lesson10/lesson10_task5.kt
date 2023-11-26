package lesson10

//import io.jsonwebtoken.Jwts
//import io.jsonwebtoken.SignatureAlgorithm
//import io.jsonwebtoken.security.Keys
//import java.util.*

fun main() {

    val shoppingCart = listOf("Часы кухонные - 1 шт.", "Весы напольные - 1 шт.", "Мешок кондитерский - 2 шт.")

    println("Необходима авторизация! \nВведите логин и пароль")
    val userInputLogin = readln()

    println("Введите пароль: ")
    val userInputPassword = readln()

    if (userVerify(userInputLogin, userInputPassword) == null) println("Авторизация неуспешна!")
    else shoppingCart.forEach() { println(it) }

}

// Верифаем данные юзера и если ок, генерим токен и возвращаем его
fun userVerify(userInputLogin: String, userInputPassword: String): String? {
    val verifyResult =
        if ((userInputLogin == USER_LOGIN) && (userInputPassword == USER_PASSWORD)) tokenGenerate()
        else null

    return verifyResult

}

fun tokenGenerate(): String {
    val chars = listOf(('a'..'z'), ('A'..'Z'), ('0'..'9')).flatten()
    var token = ""

    for (i in 1..32) {
        token += chars.random()
    }

    return token
}

// Генерим токен и возвращаем его
//fun tokenGenerate(userInputLogin: String): String {
//    val secretKey = "Keys"
//    val expirationTimeInMinute = 30
//
//    val now = Date()
//    val expirationDate = Date(now.time + expirationTimeInMinute * 60 * 1000)
//
//    return Jwts.builder()
//        .setSubject(userInputLogin)
//        .setIssuedAt(now)
//        .setExpiration(expirationDate)
//        .signWith(SignatureAlgorithm.HS256, secretKey)
//        .compact()
//
//}

const val USER_LOGIN = "Adam123"
const val USER_PASSWORD = "123qwe"
