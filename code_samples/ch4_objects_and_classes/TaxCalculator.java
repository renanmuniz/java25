package ch4_objects_and_classes;

/**
 * TaxCalculator class demonstrating:
 * - Static field (shared mutable state across all instances)
 * - Static constant (shared immutable value across all instances)
 * - Static methods (utility methods that don't require an instance)
 */
public class TaxCalculator {

    // Static constant: shared, immutable value for the default tax rate (e.g., 15%)
    public static final double DEFAULT_TAX_RATE = 0.15;

    // Static constant: maximum allowed tax rate
    public static final double MAX_TAX_RATE = 0.40;

    // Static field: tracks how many tax calculations have been performed across all instances
    private static int calculationCount = 0;

    // Instance field: each TaxCalculator can have its own custom tax rate
    private final double taxRate;

    // Default constructor uses the static constant DEFAULT_TAX_RATE
    public TaxCalculator() {
        this.taxRate = DEFAULT_TAX_RATE;
    }

    // Constructor
    public TaxCalculator(double taxRate) {
        if (taxRate > MAX_TAX_RATE) {
            throw new IllegalArgumentException("Tax rate cannot exceed " + (MAX_TAX_RATE * 100) + "%");
        }
        this.taxRate = taxRate;
    }

    // Instance method: calculates tax using this instance's tax rate
    public double calculateTax(double income) {
        calculationCount++; // increments the shared static counter
        return income * taxRate;
    }

    // Instance method: returns the net income after tax
    public double calculateNetIncome(double grossIncome) {
        calculationCount++;
        double tax = grossIncome * taxRate;
        return grossIncome - tax;
    }

    // Static method: calculates tax using a provided rate (no instance needed)
    public static double calculateTax(double income, double rate) {
        if (rate < 0 || rate > MAX_TAX_RATE) {
            throw new IllegalArgumentException("Invalid tax rate: " + rate);
        }
        calculationCount++;
        return income * rate;
    }

    // Static method: converts a percentage to a decimal rate (e.g., 15.0 -> 0.15)
    public static double percentageToRate(double percentage) {
        return percentage / 100.0;
    }

    // Static method: returns the total number of calculations performed (reads static field)
    public static int getCalculationCount() {
        return calculationCount;
    }

    // Static method: resets the calculation counter
    public static void resetCalculationCount() {
        calculationCount = 0;
    }

    // Getter for instance tax rate
    public double getTaxRate() {
        return taxRate;
    }

}

