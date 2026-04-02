package ch4_objects_and_classes;

import java.time.LocalDate;

class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private LocalDate hireDay;

    Employee(String n, double s, int year, int month, int day) {
        this.name = n;
        this.salary = s;
        this.hireDay = LocalDate.of(year, month, day);
    }

    Employee(String n, LocalDate hireDay) {
        this.name = n;
        this.hireDay = hireDay;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    LocalDate getHireDay() {
        return hireDay;
    }

    void raiseSalary(double byPercent) {
        double raise = salary * byPercent/100;
        salary+=raise;
    }
}
