package ch3_fundamentals_programming_structures_in_java;

public class Comments {
    // inline comments

    /*
     *  multi-line comments
     */

    /**
     * Javadoc comments
     * @param name the name to greet
     * @return greeting message
     */
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
