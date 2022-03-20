fun main() {
    val employeeManager =  EmployeeManagerImpl()

    employeeManager.addEmployee(Employee(1, "Kraków", 100))
    employeeManager.addEmployee(Employee(2, "Wawa", 103))
    employeeManager.addEmployee(Employee(3, "Kat", 1000))

    employeeManager.printAllEmployee()
    println(employeeManager.allEmployeeSalary())
}