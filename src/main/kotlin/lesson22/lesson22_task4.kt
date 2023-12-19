package lesson22

class ViewModel(
    val mainScreenState: MainScreenState,
) {

    fun loadData(): MainScreenState {
        return when (mainScreenState.data) {
            null -> this.mainScreenState.copy(isLoading = true)
            else -> this.mainScreenState
        }
    }

}

data class MainScreenState(
    val data: String?,
    val isLoading: Boolean = false,
)


fun main() {

    val mainScreen1 = MainScreenState(
        data = null,
    )

    val newActivity = ViewModel(mainScreenState = mainScreen1).loadData()

    println(newActivity)
}