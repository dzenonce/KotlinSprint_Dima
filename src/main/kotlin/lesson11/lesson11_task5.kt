package lesson11

class Forum(
    val memberList: MutableList<ForumMember> = mutableListOf(),

) {


    fun newForumMember(userName: String): ForumMember {
        var userCount = memberList.size

        val userName = ForumMember(
            userId = userCount + 1,
            userName = userName,
        )

        memberList.add(userName)
        return userName

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

    val newUser = Forum()
    println(newUser.memberList.size)
    val user1 = newUser.newForumMember("mai")
    val user2 = newUser.newForumMember("ma")
    val user3 = newUser.newForumMember("mami")


    println("${user1.userId} ,${user1.userName}")
    println("${user2.userId} ,${user2.userName}")
    println("${user3.userId} ,${user3.userName}")

    println(newUser.memberList[0].userName)

}