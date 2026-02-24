package ch3_fundamentals_programming_structures_in_java;

public class ConditionalStatement {
    static void main() {
        int a = 10;

        if(a >= 10) {
            IO.println("a is greater than or equal to 10");
        } else {
            IO.println("a is less than 10");
        }

        //Nested if-else statement
        int b = 20;
        if(a >= 10) {
            if(b >= 20) {
                IO.println("a is greater than or equal to 10 and b is greater than or equal to 20");
            } else {
                IO.println("a is greater than or equal to 10 but b is less than 20");
            }
        } else {
            IO.println("a is less than 10");
        }

        //If-else-if ladder
        int c = 30;
        if(c >= 30) {
            IO.println("c is greater than or equal to 30");
        } else if(c >= 20) {
            IO.println("c is greater than or equal to 20 but less than 30");
        } else {
            IO.println("c is less than 20");
        }
    }
}
