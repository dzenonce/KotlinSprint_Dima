package lesson11

class RecipeCategory(
    val id: Int,
    val name: String,
    val picture: String,
    val description: String,
    val dishList: List<Dish>,
)

class Ingredient(
    val id: Int,
    val portionCount: Int = 1,
    val productName: String,
    val productCount: Int,
    val unit: String,
)

class Dish(
    val id: Int,
    val name: String,
    val picture: String,
    val category: String,
    val ingredients: List<Ingredient>,
    val inFavorites: Boolean = false,
)

fun main() {

    val classicIngredient = Ingredient(
        id = 1,
        productName = "Булочка",
        productCount = 2,
        unit = "шт."
    )

    val ClassicHamburger = Dish(
        id = 1,
        name = "Класический гамбургер",
        picture = "cHimage.jpg",
        category = "Бургеры",
        ingredients = listOf(classicIngredient),
    )

    val gamburger = RecipeCategory(
        id = 1,
        name = "Бургеры",
        picture = "burger.jpg",
        description = "Рецепты всех популярных видов бургеров",
        dishList = listOf(ClassicHamburger),
        )

    println(gamburger.picture)
}