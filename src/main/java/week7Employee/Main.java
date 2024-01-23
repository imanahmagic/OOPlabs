package week7Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeManagmentSystem list = new EmployeeManagmentSystem();

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(123, "Iman", 32000.0));
        employees.add(new Employee(232, "Belma", 20000.0));
        employees.add(new Employee(666, "Hena", 30000.0));

        list.filterEmployeesBySalary(employees, 25000);
        list.calculateTotalSalary(employees);
        list.displayEmployeeDetails(employees);

    }
}
