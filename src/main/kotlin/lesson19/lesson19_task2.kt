package lesson19

enum class Category {

    CLOTHING {
        override fun getCategory(): String {
            return "Одежда"
        }
    },

    STATIONERY {
        override fun getCategory(): String {
            return "Канцелярские товары"
        }
    },

    MISCELLANEOUS {
        override fun getCategory(): String {
            return "Другое"
        }
    };

    abstract fun getCategory(): String

}

class Product(
    val name: String,
    val id: Int,
    val category: Category,
) {

    fun printInfo() {
        println("""
           Название: $name
           Номер: $id
           Категория: ${category.getCategory()}
        """.trimIndent())
    }

}

fun main() {

    val socks = Product(
        name = "Носки",
        id = 1,
        category = Category.CLOTHING,
    )

    val pencil = Product(
        name = "Карандаш",
        id = 2,
        category = Category.STATIONERY,
    )

    val bailer = Product(
        name = "Лейка",
        id = 3,
        category = Category.MISCELLANEOUS,
    )

    socks.printInfo()
    println()
    pencil.printInfo()
    println()
    bailer.printInfo()

}