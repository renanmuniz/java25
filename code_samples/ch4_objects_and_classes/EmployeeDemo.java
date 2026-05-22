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

        var employee4 = new Employee("Michael R", null);
        IO.println(employee4.getName()); // Michael R
        IO.println(employee4.getSalary()); // 0.0 default value for primitive double type if no value is set.
        IO.println(employee4.getHireDay()); // null, since we passed null for the hireDay parameter in the constructor.
        //IO.println(employee4.getHireDay().getYear()); // This will throw a NullPointerException because getHireDay()
        // returns null, and we are trying to call getYear() on a null reference.

        if(employee4.getHireDay() != null) {
            IO.println(employee4.getHireDay().getYear());
        } else {
            IO.println("Hire day is not set for " + employee4.getName());
        }

        var employee5 = new Employee("John D", LocalDate.now());
        IO.println(employee5.getName());
        IO.println(employee5.getAddress()); // Company street n123 - NYC

        var employee6 = new Employee("Michael R", 4_000, 2026, 4, 30, null);
        IO.println(employee6.getName()); // Michael R
        IO.println(employee6.getAddress()); // Company street n321 - NYC

        //var employee7 = new Employee("Donald T", 5_000, 2026, 2, 13, "Company street n321 - NYC", null);
        // This will throw a NullPointerException because the constructor of Employee class is designed to throw an exception if the email parameter is null.

        //Using private methods:
        var employee8 = new Employee("Ronald M", 5_000, 2025, 4, 15, "Company street n321 - NYC", "mail@email.com");
        IO.println("Bonus Eligible? " + employee8.isBonusEligible()); //true

        var employee9 = new Employee("Ronald M", 4_999, 2025, 4, 15, "Company street n321 - NYC", "mail@email.com");
        IO.println("Bonus Eligible? " + employee9.isBonusEligible()); //false

        var employee10 = new Employee("Ronald M", 5_001, 2026, 4, 15, "Company street n321 - NYC", "mail@email.com");
        IO.println("Bonus Eligible? " + employee10.isBonusEligible()); //false

        //Final Instance Field
        IO.println("UUID" + employee10.getUuid());

    }
}
