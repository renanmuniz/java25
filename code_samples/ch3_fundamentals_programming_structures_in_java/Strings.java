package ch3_fundamentals_programming_structures_in_java;

public class Strings {
    static void main() {
        String name = "John" + " " + "Doe";
        IO.println(name); // Output: John Doe

        String greeting = "Hello, %s!".formatted(name);
        IO.println(greeting); // Output: Hello, John Doe!

        String message = "Total value is: %.2f".formatted(123.456);
        IO.println(message); // Output: Total value is: 123.46

        String status = "System active: %b".formatted(true);
        IO.println(status); // Output: System active: true

        String error = "Error code: %d. Message: %s".formatted(404, "Not Found"); // Error code: 404. Message: Not Found
        IO.println(error); // Output: Error code: 404. Message: Not Found

        //join method:
        // Joins the strings with a comma and space as a delimiter
        String joined = String.join(", ", "Apple", "Banana", "Cherry"); // Apple, Banana, Cherry
        IO.println(joined); // Output: Apple, Banana, Cherry
    }
}
