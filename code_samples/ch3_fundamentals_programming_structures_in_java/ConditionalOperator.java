package ch3_fundamentals_programming_structures_in_java;

public class ConditionalOperator {
    static void main() {
        int a = 10;
        int b = 20;

        // Conditional (Ternary) Operator
        String result = (a > b) ? "a is greater than b" : "a is not greater than b";
        System.out.println(result); // Output: a is not greater than b

        double temperature = 22.0;
        temperature > 23.0 ? turnAirConditioner() : doNothing();
    }

    static void turnAirConditioner() {
        System.out.println("Turning on the air conditioner.");
    }

    static void doNothing() {
        System.out.println("No action needed.");
    }


}
