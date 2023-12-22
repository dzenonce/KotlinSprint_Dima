package lesson22

class ViewModel(
    val mainScreenState: MainScreenState = MainScreenState(null),
) {

    data class MainScreenState(
        val data: String?,
        var isLoading: Boolean = false,
    )

    fun loadData(): MainScreenState {

        return when (mainScreenState.data) {
            null -> {
                mainScreenState.copy(isLoading = true)

                for (percent in 0..100 step 25) {
                    Thread.sleep(100)
                    println("Подождите, идет загрузка $percent%")
                }

                mainScreenState.copy(data = "Загруженное изображение", isLoading = false)
            }

            else -> mainScreenState
        }
    }
}


fun main() {

    val screen = ViewModel().loadData()

    println(screen)
}
