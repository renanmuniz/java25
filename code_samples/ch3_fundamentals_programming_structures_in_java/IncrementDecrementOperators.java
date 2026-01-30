package ch3_fundamentals_programming_structures_in_java;

public class IncrementDecrementOperators {
    static void main(String[] args) {
        int a = 5;
        System.out.println("Initial value of a: " + a); // 5

        // Post-increment
        int postIncrement = a++;
        System.out.println("Post-increment (a++): " + postIncrement); // 5
        System.out.println("Value of a after post-increment: " + a); // 6

        // Pre-increment
        int preIncrement = ++a;
        System.out.println("Pre-increment (++a): " + preIncrement); // 7
        System.out.println("Value of a after pre-increment: " + a); // 7

        // Post-decrement
        int postDecrement = a--;
        System.out.println("Post-decrement (a--): " + postDecrement); // 7
        System.out.println("Value of a after post-decrement: " + a); // 6

        // Pre-decrement
        int preDecrement = --a;
        System.out.println("Pre-decrement (--a): " + preDecrement); // 5
        System.out.println("Value of a after pre-decrement: " + a); // 5

        // Increment and decrement with double
        double x = 10.5;
        System.out.println("Initial value of x: " + x); // 10.5
        // Post-increment
        double postIncX = x++;
        System.out.println("Post-increment (x++): " + postIncX); // 10.5
        System.out.println("Value of x after post-increment: " + x); // 11.5

        // Pre-decrement
        double preDecX = --x;
        System.out.println("Pre-decrement (--x): " + preDecX); // 10.5
        System.out.println("Value of x after pre-decrement: " + x); // 10.5
    }
}
