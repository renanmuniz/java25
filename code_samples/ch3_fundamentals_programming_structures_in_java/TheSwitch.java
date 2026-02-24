package ch3_fundamentals_programming_structures_in_java;

public class TheSwitch {
     static void main(String[] args) {
        System.out.println("=== Traditional Switch Statement ===");
        SwitchStatementExample();

        System.out.println("\n=== Switch Expressions (Java 14+) ===");
        switchExpressionExamples();
    }

    private static void SwitchStatementExample() {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    // Switch expression (Java 14+):
    static void switchExpressionExamples() {
        // Example 1: Basic switch expression with arrow syntax
        int day = 3;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println("Day: " + dayName);

        // Example 2: Multiple case labels
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid";
        };
        System.out.println("Day type: " + dayType);

        // Example 3: Switch expression with code blocks and yield
        String message = switch (day) {
            case 1, 2, 3, 4 -> {
                String prefix = "It's a weekday: ";
                yield prefix + dayName;
            }
            case 5 -> "TGIF! It's Friday!";
            case 6, 7 -> "Enjoy your weekend!";
            default -> "Invalid day number";
        };
        System.out.println(message);

        // Example 4: Switch expression with enum
        Season season = Season.SUMMER;
        String activity = switch (season) {
            case SPRING -> "Plant flowers";
            case SUMMER -> "Go to the beach";
            case FALL -> "Harvest crops";
            case WINTER -> "Build a snowman";
        };
        System.out.println("Activity: " + activity);

        // Example 5: Traditional switch with yield (Java 14+)
        int temperature = switch (season) {
            case SPRING: yield 20;
            case SUMMER: yield 30;
            case FALL: yield 15;
            case WINTER: yield 5;
        };
        System.out.println("Average temperature: " + temperature + "°C");
    }

    enum Season {
        SPRING, SUMMER, FALL, WINTER
    }
}
