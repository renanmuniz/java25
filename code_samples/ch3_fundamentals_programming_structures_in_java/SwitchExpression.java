package ch3_fundamentals_programming_structures_in_java;

public class SwitchExpression {
    static void main() {
        int day = 3;
        String dayName = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> {
                IO.println("Log: Not valid input: " + day);
                yield "Invalid day informed %d".formatted(day);
            }
        };
        IO.println("Day informed: %s".formatted(dayName));
    }
}
