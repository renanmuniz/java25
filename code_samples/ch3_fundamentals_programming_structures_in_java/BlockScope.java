package ch3_fundamentals_programming_structures_in_java;

public class BlockScope {
    static void main() {
        int a = 10;
        if(a >= 10) {
            int b = 20;
            int c = a + b;
            IO.println("Sum is: " + c); //Sum is: 30

            //double a = 33.3; //error: Variable 'a' is already defined in the scope.
        }
        //IO.println("Value of c is: " + c); //error: Cannot find symbol 'c' because it is defined in the if block and not accessible outside of it.
    }
}
