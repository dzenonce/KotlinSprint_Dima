package lesson6

fun main() {

    println("Регистрация нового пользователя! \nВведите желаемый логин: ")
    val newUserLogin = readln()

    println("Введите пароль: ")
    val newUserPassword = readln()

    do {
        println("Выполните вход в приложение! \nВведите ваш логин:")
        val userLogin = readln()

        println("Введите ваш пароль: ")
        val userPassword = readln()

    } while ((userLogin != newUserLogin) || (userPassword != newUserPassword))

    println("Авторизация прошла успешно!")

}