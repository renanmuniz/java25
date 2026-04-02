package ch4_objects_and_classes;

import java.time.LocalDate;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        
        staff[0] = new Employee("Carl C", 7500, 1987, 12, 15);
        staff[1] = new Employee("Harry H", 5000, 1989, 10, 1);
        staff[2] = new Employee("Tony T", 4000, 1990, 3, 15);

        for(Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            IO.println("Name: " + e.getName() +
                             ", Salary: " + e.getSalary() + 
                             ", Hire Day: " + e.getHireDay());
        }

        Employee anotherEmployee = new Employee("Michael R", LocalDate.now());
        IO.println("Name: " + anotherEmployee.getName() +
                   ", Salary: " + anotherEmployee.getSalary() +
                   ", Hire Day: " + anotherEmployee.getHireDay());

        //var keyword:
        var employee3 = new Employee("John D", 3000, 1995, 6, 1);
        IO.println("Name: " + employee3.getName() +
                   ", Salary: " + employee3.getSalary() +
                   ", Hire Day: " + employee3.getHireDay());
        IO.println(employee3.getClass().getName()); // ch4_objects_and_classes.Employee

        var name = employee3.getName();
        IO.println(name.getClass().getName()); // java.lang.String

    }
}
