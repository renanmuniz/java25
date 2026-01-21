package ch3_fundamentals_programming_structures_in_java;

public class Constants {

    final double TAX_RATE = 0.10;

    double calculateTax(double amount) {
        return amount * TAX_RATE;
    }

    double calculateTotalAmount(double amount) {
        return amount + calculateTax(amount);
    }

    void main() {

        //TAX_RATE = 0.15; // Cannot assign a value to final variable 'TAX_RATE'

        double amount = 100.0;
        double tax = calculateTax(amount);
        double total = calculateTotalAmount(amount);

        System.out.println("Amount: " + amount);
        System.out.println("Tax: " + tax);
        System.out.println("Total Amount: " + total);
    }

}
