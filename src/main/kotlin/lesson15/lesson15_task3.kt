package lesson15

abstract class ForumUser(
    val id: Int,
    val username: String,
    val hasAdminPrivileged: Boolean = false,
) {

    fun readForum() {
        println("$username сейчас на форуме")
    }

    fun writeMessage() {
        println("$username написал сообщение")
    }

}

class RegularUser(
    id: Int,
    username: String,
    hasAdminPrivileged: Boolean = false,
) : ForumUser(id, username, hasAdminPrivileged)

class Admin(
    id: Int,
    username: String,
    hasAdminPrivileged: Boolean = true,
) : ForumUser(id, username, hasAdminPrivileged) {

    fun deleteMessage() {
        println("$username удалил сообщение")
    }

    fun deleteUser() {
        println("$username удалил пользователя")
    }
}

fun main() {

    val regularUser = RegularUser(
        id = 1,
        username = "JustUser",
    )

    val admin = Admin(
        id = 0,
        username = "Admin",
    )

    regularUser.readForum()
    regularUser.writeMessage()

    println()

    admin.readForum()
    admin.writeMessage()
    admin.deleteUser()
    admin.deleteMessage()

}