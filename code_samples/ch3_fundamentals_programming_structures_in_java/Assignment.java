package ch3_fundamentals_programming_structures_in_java;

public class Assignment {

    static void main(String[] args) {
        // Variable declaration and assignment
        int a = 10; // declaring an integer variable 'a' and assigning it the value 10
        double b = 20.5; // declaring a double variable 'b' and assigning it the value 20.5
        String c = "Hello, World!"; // declaring a String variable 'c' and assigning it a greeting message

        // Printing the values to the console
        System.out.println("Integer a: " + a);
        System.out.println("Double b: " + b);
        System.out.println("String c: " + c);

        int x = a + 5; // assigning a new value to 'x' based on 'a'
        System.out.println("New value x (a + 5): " + x);

        // Compound assignment
        a += 15; // equivalent to a = a + 15
        System.out.println("Updated value of a after compound assignment (a += 15): " + a); // Updated value of an after compound assignment (a += 15): 25

        b -= 5.5; // equivalent to b = b - 5.5
        System.out.println("Updated value of b after compound assignment (b -= 5.5): " + b); // Updated value of b after compound assignment (b -= 5.5): 15.0


        // Demonstrating type compatibility in compound assignments
        int z = 50;
        z += 2.9; // This doesn't cause a compile-time error; 2.9 is cast to int (2) before addition
        System.out.println("Updated value of z after compound assignment (z += 2.9): " + z);

        double e = 3.5;
        e *= 2; // This is valid; 2 is promoted to double before multiplication
        System.out.println("Updated value of e after compound assignment (e *= 2): " + e); // Updated value of e after compound assignment (e *= 2): 7.0

        String f = "Hello, World!";
        f += " How are you?"; // This is valid; concatenates the string
        System.out.println("Updated value of f after compound assignment (f += \" How are you?\"): " + f); // Updated value of f after compound assignment (f += " How are you?"): Hello, World! How are you?

        String g = "Temperature: ";
        g += 25.5; // This is valid; converts 25.5 to String and concatenates
        System.out.println("Updated value of g after compound assignment (g += 25.5): " + g); // Updated value of g after compound assignment (g += 25.5): Temperature: 25.5


    }

}
