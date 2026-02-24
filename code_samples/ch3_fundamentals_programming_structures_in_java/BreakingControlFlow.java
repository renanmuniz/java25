package ch3_fundamentals_programming_structures_in_java;

public class BreakingControlFlow {
    static void main() {
        // Break:
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println(i);
        }

        // Labeled break:
        outerLoop:
        for (int i = 0; i < 5; i++) {
            System.out.println("Outer loop iteration: " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("  Inner loop iteration: " + j);
                if (i == 2 && j == 2) {
                    System.out.println("Breaking out of the outer loop at i: " + i + ", j: " + j);
                    break outerLoop; // Exit the outer loop when i is 2 and j is 2
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        // Continue:
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(i); // Print only odd numbers
        }

        // Return:
        testContinueStatement();
    }

    private static void testContinueStatement() {
        for(int i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println(i);
        }
    }
}
