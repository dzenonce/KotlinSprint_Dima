package lesson17

class OneUser(
    private var _login: String,
    private val _password: String,
) {

    var login: String = _login
        get() = field
        set(value) {
            field = value
            println("Логин успешно изменен")
        }

    var password: String = _password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }

}

fun main() {

    val user = OneUser(
        _login = "Ok",
        _password = "pass",
    )

    println(user.login)
    user.login = "NeOk"
    println(user.login)

    println(user.password)
    user.password = "123"
    println(user.password)
}
