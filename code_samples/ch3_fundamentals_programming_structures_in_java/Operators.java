package ch3_fundamentals_programming_structures_in_java;

public class Operators {
    void main() {
        // Arithmetic Operators
        // Sum operator:
        int a = 10;
        int b = 20;
        int sum = a + b;
        IO.println("Sum is: " + sum); // Sum is: 30

        // Minus operator:
        int difference = b - a;
        IO.println("Difference is: " + difference); // Difference is: 10

        // Multiplication operator:
        int product = a * b;
        IO.println("Product is: " + product); // Product is: 200

        // Division operator:
        int quotient = b / a;
        IO.println("Quotient is: " + quotient); // Quotient is: 2

        // Modulus/Remainder operator:
        double c = 7;
        double d = 2;
        double remainder = c % d; // 7 divided by 2 is equal to 3 with a remainder of 1
        IO.println("Remainder is: " + remainder); // Remainder is: 1
    }
}
