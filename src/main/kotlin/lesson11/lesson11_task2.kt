package lesson11

class UserData2(
    val uid: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = ""
) {

    fun aboutAUser() {
        println(
            """
           Данные пользователя $login.
           Uid      - $uid
           Login    - $login
           Password - $password
           email    - $email
           bio      - $bio
           """.trimIndent()
        )
    }

    fun addBio() {
        println("Введите данные для поля bio")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль: ")

        if (readln().equals(password, true)) {
            println("Введите новый пароль: ")
            password = readln()

            println("Пароль успешно измене!")
        } else println("Текущий пароль введен не верно!")

    }
}

fun main() {

    val user1 = UserData2(
        uid = 1,
        login = "User1",
        password = "123",
        email = "mail@rambler.ru"
    )

    user1.aboutAUser()

    user1.addBio()

    user1.changePassword()

    user1.aboutAUser()

}