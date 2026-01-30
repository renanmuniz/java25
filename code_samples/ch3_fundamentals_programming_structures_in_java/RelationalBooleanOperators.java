package ch3_fundamentals_programming_structures_in_java;

public class RelationalBooleanOperators {
    static void main() {
        int a = 10;
        int b = 20;

        // Relational Operators
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true

        // > Greater than
        System.out.println("a > b: " + (a > b)); // false

        // < Less than
        System.out.println("a < b: " + (a < b)); // true

        // >= Greater than or equal to
        System.out.println("a >= b: " + (a >= b)); // false

        // <= Less than or equal to
        System.out.println("a <= b: " + (a <= b)); // true

        // Boolean Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND. Result: false
        System.out.println("x || y: " + (x || y)); // Logical OR. Result: true
        System.out.println("!x: " + (!x));         // Logical NOT. Result: false
    }
}
