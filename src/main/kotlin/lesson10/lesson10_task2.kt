package lesson10

fun main() {
    println("Добро пожаловать на регистрацию, введите логин:")
    val userLogin = readln()

    println("Введите пароль")
    val userPassword = readln()

    println(userDataValidation(userLogin, userPassword))
}

fun userDataValidation(userLogin: String, userPassword: String) : String {
    if (userLogin.length < 4 || userPassword.length < 4) return "Логин и пароль недостаточно длинные"
    else return "Регистрация успешна"
}