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

        // The Java String API's:
        // Here are some examples of the String API methods:
        String example = "Hello, World!";
        IO.println(example.toUpperCase()); // Output: HELLO, WORLD!
        IO.println(example.toLowerCase()); // Output: hello, world!
        IO.println(example.trim()); // Output: Hello, World! (removes leading and trailing whitespace)
        IO.println(example.replace('o', 'x')); // Output: Hellx, Wxrld! (replaces all occurrences of 'o' with 'x')
        IO.println(example.contains("World")); // Output: true (checks if the string contains the substring "World")
        IO.println(example.startsWith("Hello")); // Output: true (checks if the string starts with "Hello")
        IO.println(example.endsWith("!")); // Output: true (checks if the string ends with "!")
        IO.println(example.split(", ")[0]); // Output: Hello (splits the string into an array using ", " as the delimiter and returns the first element)
        IO.println(example.isBlank()); // Output: false (checks if the string is empty or contains only whitespace)
        IO.println(example.isEmpty()); // Output: false (checks if the string is empty, i.e., has a length of 0)
        IO.println(example.length()); // Output: 13 (returns the length of the string)

        // StringBuilder:
        // Here is an example of using StringBuilder to efficiently build a string for a dynamic SQL query:
        StringBuilder sqlQuery = new StringBuilder();
        sqlQuery.append("SELECT * FROM users WHERE age > ?");
        sqlQuery.append(" AND city = ?");
        sqlQuery.append(" AND status = ?");
        sqlQuery.append(" AND registration_date > ?");
        String finalQuery = sqlQuery.toString();
        IO.println(finalQuery); // Output: "SELECT * FROM users WHERE age > ? AND city = ? AND status = ? AND registration_date > ?"

        // Text blocks
        String textBlock = """
                This is a text block in Java.
                It allows for multi-line strings without needing escape characters.
                """;
        System.out.println("Text Block:\n" + textBlock);

        String formattedTextBlock = """
                Hello, %s!
                Welcome to Java programming.
                """.formatted("Alice");
        System.out.println("Formatted Text Block:\n" + formattedTextBlock);

        String sqlCommand = """
                SELECT *
                FROM users
                WHERE age > ?
                AND city = ?
                AND status = ?
                AND registration_date > ?
                """;
        System.out.println("SQL Command:\n" + sqlCommand);


    }
}
