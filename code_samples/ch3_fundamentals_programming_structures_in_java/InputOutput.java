package ch3_fundamentals_programming_structures_in_java;

public class InputOutput {
    //To run the System.console() method, you need to run the program in a terminal or command prompt, as it may not work properly in an IDE.
    //Instructions to run in the console:
    //1. Compile the Java program:
    //   javac code_samples/ch3_fundamentals_programming_structures_in_java/InputOutput.java
    //2. Run the compiled program:
    //   java -cp code_samples ch3_fundamentals_programming_structures_in_java.InputOutput

    //Using IO.readln() and IO.println() to read and write data
    static void main(String[] args) {
        IO.println("What is your name?");
        String name = IO.readln();
        IO.println("Hello, " + name + "!");

        // Formatting output using IO.print():
        IO.println("Formatted output:");
        IO.print("Name: %s, Age: %d\n".formatted("Renan", 35));


        //For passwords, use console.readPassword() to read the password without echoing it to the console
//        String username = System.console().readLine("Enter your username:");
//        char[] password = System.console().readPassword("Enter the password:");
//        IO.println("Username: " + username);
//        IO.println("Password: " + new String(password));
    }

}
