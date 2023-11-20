package lesson4

fun main() {
    val trainingDayNumber = 5

    val whatsTraining = trainingDayNumber % 2

    val isArmAbsWorkout = whatsTraining != 0
    val isLegBackWorkout = whatsTraining == 0


    val trainingShedule = """
    Упражнения для рук:     $isArmAbsWorkout
    Упражнения для ног:     $isLegBackWorkout
    Упражнения для спины:   $isLegBackWorkout
    Упражнения для пресса:  $isArmAbsWorkout
    """.trimIndent()

    println(trainingShedule)
}
