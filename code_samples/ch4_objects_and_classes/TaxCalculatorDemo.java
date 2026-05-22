package ch4_objects_and_classes;

public class TaxCalculatorDemo {
    static void main(String[] args) {
        IO.println("=== TaxCalculator Demo ===\n");

        // --- Static constant ---
        IO.println("Static Constants:");
        System.out.printf("  DEFAULT_TAX_RATE : %.0f%%%n", TaxCalculator.DEFAULT_TAX_RATE * 100);
        System.out.printf("  MAX_TAX_RATE     : %.0f%%%n", TaxCalculator.MAX_TAX_RATE * 100);

        // --- Static method (no instance required) ---
        IO.println("\nStatic Method - calculateTax(income, rate):");
        double tax1 = TaxCalculator.calculateTax(50_000, TaxCalculator.DEFAULT_TAX_RATE);
        System.out.printf("  Tax on $50,000 at %.0f%% = $%.2f%n", TaxCalculator.DEFAULT_TAX_RATE * 100, tax1);

        double customRate = TaxCalculator.percentageToRate(25.0);
        double tax2 = TaxCalculator.calculateTax(80_000, customRate);
        System.out.printf("  Tax on $80,000 at 25%% = $%.2f%n", tax2);

        // --- Static field usage ---
        IO.println("\nStatic Field - calculationCount after static calls: " + TaxCalculator.getCalculationCount());

        // --- Instance usage ---
        IO.println("\nInstance Methods:");
        TaxCalculator defaultCalc = new TaxCalculator();
        System.out.printf("  Default calculator tax rate: %.0f%%%n", defaultCalc.getTaxRate() * 100);
        System.out.printf("  Tax on $60,000 = $%.2f%n", defaultCalc.calculateTax(60_000));
        System.out.printf("  Net income from $60,000 = $%.2f%n", defaultCalc.calculateNetIncome(60_000));

        TaxCalculator highCalc = new TaxCalculator(0.30);
        System.out.printf("  High-rate calculator tax rate: %.0f%%%n", highCalc.getTaxRate() * 100);
        System.out.printf("  Tax on $100,000 = $%.2f%n", highCalc.calculateTax(100_000));

        // --- Static field reflects ALL calculations across ALL instances ---
        IO.println("\nStatic Field - total calculationCount across all instances: " + TaxCalculator.getCalculationCount());

        // --- Reset static field ---
        TaxCalculator.resetCalculationCount();
        IO.println("After reset, calculationCount = " + TaxCalculator.getCalculationCount());
    }
}
