package ch3_fundamentals_programming_structures_in_java;

public class Variables {
    void main() {
        // Variable declaration
        int number;
        // Variable initialization
        number = 10;

        // Variable declaration and initialization in one line
        String message = "Hello, World!";

        // Using the variables
        System.out.println(message + " The number is: " + number);

        int notInitialized;
        // The following line would cause a compile-time error because 'notInitialized' is not initialized
        //System.out.println(notInitialized); //Variable 'notInitialized' might not have been initialized

        var firstValue = 10;
        var secondValue = 20;
        IO.println("Sum is: " + (firstValue + secondValue)); // Sum is: 30

        var name = "Renan";
        IO.println(name.getClass()); //class java.lang.String

    }
}
