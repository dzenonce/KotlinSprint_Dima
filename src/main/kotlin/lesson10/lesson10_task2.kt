package lesson10

fun main() {

    do {
        println("Введите логин: ")
        val userLogin = readln()

        println("Введите пароль: ")
        val userPassword = readln()

        val isValidCredential = credentialValidate(userLogin, userPassword)

        if (isValidCredential) println("Логин или пароль недостаточно длинные")

    } while (isValidCredential)

    println("Регистрация прошла успешно, доступ разрешен!")

}

fun credentialValidate(userLogin : String, userPassword : String) : Boolean {
        val isResult =
            if ((userLogin.length <= MINIMAL_CREDENTIAL_LENGTH) || (userPassword.length <= MINIMAL_CREDENTIAL_LENGTH)) true
            else false

        return isResult
}

const val MINIMAL_CREDENTIAL_LENGTH = 4