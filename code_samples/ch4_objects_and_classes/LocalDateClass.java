package ch4_objects_and_classes;

import java.time.LocalDate;

public class LocalDateClass {
    static void main() {
        java.time.LocalDate today = LocalDate.now();
        IO.println("Today's date: " + today);

        java.time.LocalDate specificDate = LocalDate.of(2024, 6, 15);
        IO.println("Specific date: " + specificDate);

        java.time.LocalDate tomorrow = today.plusDays(1);
        IO.println("Tomorrow's date: " + tomorrow);

        java.time.LocalDate yesterday = today.minusDays(1);
        IO.println("Yesterday's date: " + yesterday);

        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        IO.println("Year: %d, Month: %d, Day: %d".formatted(year, month, day));
    }
}
