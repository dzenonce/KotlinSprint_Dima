package lesson2

fun main() {
    val amountRegularStaff = 50
    val salaryRegularStaff = 30000

    val amountInterns = 30
    val salaryInterns = 20000

    val totalCostRegularStaff = amountRegularStaff * salaryRegularStaff
    val totalCostInterns = amountInterns * salaryInterns

    val totalSalaryCost = totalCostRegularStaff + totalCostInterns

    val averageEmployeeSalary = totalSalaryCost / (amountRegularStaff + amountInterns)

    println(totalCostRegularStaff)
    println(totalCostInterns)
    println(averageEmployeeSalary)

}