package ch4_objects_and_classes;

import java.time.LocalDate;
import java.util.Objects;

class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private LocalDate hireDay;
    private String address = "Company street n123 - NYC";
    private String email;

    Employee(String n, double s, int year, int month, int day) {
        this.name = n;
        this.salary = s;
        this.hireDay = LocalDate.of(year, month, day);
    }

    Employee(String n, LocalDate hireDay) {
        this.name = n;
        this.hireDay = hireDay;
    }

    Employee(String n, double s, int year, int month, int day, String address) {
        this.name = n;
        this.salary = s;
        this.hireDay = LocalDate.of(year, month, day);
        this.address = Objects.requireNonNullElse(address, "Company street n321 - NYC");
    }

    Employee(String n, double s, int year, int month, int day, String address, String email) {
        this.name = n;
        this.salary = s;
        this.hireDay = LocalDate.of(year, month, day);
        this.address = address;
        this.email = Objects.requireNonNull(email, "Email cannot be null");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent/100;
        this.salary += raise;
    }

    public static void validateSalary(double salary) {
        if(salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
    }
}
