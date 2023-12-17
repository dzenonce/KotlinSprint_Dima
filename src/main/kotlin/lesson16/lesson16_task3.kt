package lesson16

class Userok(
    val username: String,
    private val password: String,
) {

    fun validatePassword(inputPassword: String) = password.equals(inputPassword, ignoreCase = false)

}

fun main() {

    val user1 = Userok(
        username = "Userok",
        password = "123",
    )

    println("Введите пароль:")
    println(user1.validatePassword(readln()))

}