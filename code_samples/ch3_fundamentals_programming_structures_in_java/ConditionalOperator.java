package ch3_fundamentals_programming_structures_in_java;

public class ConditionalOperator {
    static void main() {
        int a = 10;
        int b = 20;

        // Conditional (Ternary) Operator
        String result = (a > b) ? "a is greater than b" : "a is not greater than b";
        System.out.println(result); // Output: a is not greater than b
    }
}
