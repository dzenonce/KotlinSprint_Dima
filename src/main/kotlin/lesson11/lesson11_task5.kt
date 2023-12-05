package lesson11

class Forum {

    val memberList: MutableList<ForumMember> = mutableListOf()
    val forumMessage: MutableList<ForumMessage> = mutableListOf()

    fun newForumMember(userName: String): ForumMember {
        var userCount = memberList.size

        val newUser = ForumMember(
            userId = userCount + 1,
            userName = userName,
        )

        memberList.add(newUser)
        return newUser

    }

    fun createNewMessage(userId: Int, _message: String) {
        memberList.forEach() {
            if (userId.equals(it.userId)) {
                val forumSms = ForumMessage(
                    authorId = userId,
                    message = _message,
                )
                forumMessage.add(forumSms)
            }
        }
    }

    fun printThread() {
        for (user in memberList) {
            for (message in forumMessage) {
                println("${user.userId}: ${message.message}")
            }
        }
    }

}

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

fun main() {

    val forum = Forum()

    val user1 = forum.newForumMember("mai")
    val user2 = forum.newForumMember("ma")

    println("${user1.userId} ,${user1.userName}")
    println("${user2.userId} ,${user2.userName}")

    forum.createNewMessage(user2.userId, "Привет от 2-го")
    forum.createNewMessage(user2.userId, "Как дела")

    forum.createNewMessage(user1.userId, "Привет")
    forum.createNewMessage(user1.userId, "Потихоньку")

    forum.printThread()
}