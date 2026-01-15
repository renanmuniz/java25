package ch3_fundamentals_programming_structures_in_java;

public class MethodReturnType {
    static void main() {
        MethodReturnType methodReturnType = new MethodReturnType();
        methodReturnType.print(methodReturnType.sum(3,5));
    }

    private int sum(int a, int b) {
        return a + b;
    }

    private void print(int sum) {
        IO.println("The sum is " + sum(3, 5));
    }
}
