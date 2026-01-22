package ch3_fundamentals_programming_structures_in_java;

public class NumericTypeConversions {
    void main() {
        int intValue = 100;
        double doubleValue = intValue; // Implicit conversion from int to double
        System.out.println("Double value: " + doubleValue); // Double value: 100.0

        double anotherDoubleValue = 99.99;
        int anotherIntValue = (int) anotherDoubleValue; // Explicit conversion from double to int
        System.out.println("Integer value: " + anotherIntValue); // Integer value: 99


        // Long to double conversion - demonstrating loss of precision
        long largeLongValue = 123456789012345678L;
        double doubleFromLong = largeLongValue; // Implicit conversion from long to double
        long backToLong = (long) doubleFromLong; // Converting back to long

        System.out.println("Original long value: " + largeLongValue); // Original long value: 123456789012345678
        System.out.println("After conversion to double and back to long: " + backToLong); // After conversion to double and back to long: 123456789012345680
        System.out.println("Precision lost: " + (largeLongValue - backToLong)); // Precision lost: -2
    }
}
