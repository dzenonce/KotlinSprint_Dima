package lesson22

class ViewModel(
    val mainScreenState: MainScreenState,
) {

    fun loadData(): MainScreenState {
        return when (mainScreenState.data) {
            null -> this.mainScreenState
            else -> this.mainScreenState.copy(isLoading = true)
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

    val viewModel = ViewModel(
        mainScreenState = mainScreen1,
    )

    val newActivity = viewModel.loadData()

    println(newActivity)
}