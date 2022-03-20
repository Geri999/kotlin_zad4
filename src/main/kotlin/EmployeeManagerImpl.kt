class EmployeeManagerImpl : EmployeeManager {

    var employeeList = mutableListOf<Employee>()

    override fun addEmployee(employee: Employee) {
        employeeList.add(employee)
    }

    override fun printAllEmployee() {
        employeeList.forEach { s -> println(s) }
    }

    override fun allEmployeeSalary(): Int {
        return employeeList.map { s -> s.salary }.sum()
    }
}