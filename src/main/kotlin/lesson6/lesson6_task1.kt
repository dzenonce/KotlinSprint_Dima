package lesson6

fun main() {

    println(
        """Регистрация нового пользователя!
    |Введите желаемый логин: """.trimMargin()
    )
    val newUserLogin = readln()

    println("Введите пароль: ")
    val newUserPassword = readln()

    do {
        println(
            """Выполните вход в приложение!
        |Введите ваш логин:
        """.trimMargin()
        )
        val userLogin = readln()

        println("Введите ваш пароль: ")
        val userPassword = readln()

        val isCorrectInput = (userLogin == newUserLogin) && (userPassword == newUserPassword)

    } while (!isCorrectInput)

    println("Авторизация прошла успешно!")

}