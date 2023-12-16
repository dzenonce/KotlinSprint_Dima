package lesson19

enum class Category(
    val categoryName: String,
) {

    CLOTHING("Одежда"),
    STATIONERY("Канцелярские товары"),
    MISCELLANEOUS("Другое");

    fun getCategoryName() {
        println(categoryName)
    }
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
           Категория: ${category.categoryName}
        """.trimIndent())
    }

}

fun main() {

    Category.CLOTHING.getCategoryName()

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