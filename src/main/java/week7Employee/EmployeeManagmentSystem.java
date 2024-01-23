package week7Employee;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class EmployeeManagmentSystem {
    public void filterEmployeesBySalary(List<Employee> employees, double min_salary){
        ArrayList<String> new_list = new ArrayList<>();
        for(Employee i: employees){
            if(i.salary() >= min_salary){
                new_list.add(i.name());
            }
        }
        System.out.println("[" + new_list + "]");
    }
    public void calculateTotalSalary(List<Employee> employees){
        double sum =0;
        for(Employee i:employees){
            sum+=i.salary();
        }
        System.out.println("Total salary is: " + sum);
    }
    public void displayEmployeeDetails(List<Employee> employees){
        for(Employee i: employees){
            System.out.println("Name of employee: " + i.name() + " Salary: " + i.salary());
        }
    }
}
