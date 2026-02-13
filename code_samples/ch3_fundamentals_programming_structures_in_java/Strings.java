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

        IO.println("New York".length()); // Output: 8

        IO.println("New York".charAt(0)); // Output: 'N'
        IO.println("New York".charAt(3)); // Output: ' ' (space)
        //IO.println("New York".charAt(10)); // Error: StringIndexOutOfBoundsException: Index 10 out of bounds for length 8

        // indexOf method:
        IO.println("Hello, World!".indexOf('o')); // Output: 4
        IO.println("Hello, World!".indexOf('o', 5)); // Output: 8
        IO.println("Hello, World!".indexOf('x')); // Output: -1 (not found)

        // substring method:
        IO.println("Hello, World!".substring(0, 5)); // Output: Hello
        IO.println("Hello, World!".substring(7)); // Output: World!

        // String imutability:
        String original = "Hello";
        String modified = original.replace('l', 'x');
        IO.println(original); //  Hello
        IO.println(modified); //  Hexxo

        // String pooling:
        String a = "Hello";
        String b = "Hello";
        IO.println(a == b); // true (both refer to the same string literal in the string pool)

        String c = new String("Hello"); // creates a new String object in memory
        IO.println(a == c); // false (a and c refer to different objects in memory)
        IO.println(a.equals(c)); // true (a and c have the same content)

        // String equality:
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        IO.println(str1 == str2); // true (both refer to the same string literal in the string pool)
        IO.println(str1 == str3); // false (str1 and str3 refer to different objects in memory)
        IO.println(str1.equals(str3)); // true (str1 and str3 have the same content)

        // Empty and Null Strings:
        String emptyString = "";
        String nullString = null;
        IO.println("Length of empty string: " + emptyString.length()); // Output: 0
        //IO.println("Length of null string: " + nullString.length()); // Throws NullPointerException: Cannot invoke "String.length()" because "nullString" is null

        if(nullString != null) {
            IO.println("nullString: " + nullString); // This block will not execute because nullString is null
        }

        if(emptyString != null) {
            IO.println("emptyString: " + emptyString); // Output: emptyString:  (prints the empty string, which is just a blank line)
        }
    }
}
