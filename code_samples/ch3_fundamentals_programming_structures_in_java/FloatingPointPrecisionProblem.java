package ch3_fundamentals_programming_structures_in_java;

public class FloatingPointPrecisionProblem {
    static void main() {
        float a = 1.0f;
        float b = 0.9f;
        float c = a - b;
        System.out.println("Expected: 0.1, Actual: " + c); //Expected: 0.1, Actual: 0.100000024
    }
}
