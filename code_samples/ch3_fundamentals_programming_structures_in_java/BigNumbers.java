package ch3_fundamentals_programming_structures_in_java;

import java.math.BigDecimal;

public class BigNumbers {
    static void main() {
        IO.println("3.9 Big Numbers");

        IO.println("BigDecimal:");
        BigDecimal bigDecimal1 = new BigDecimal("123456789012.564321");
        IO.println("BigDecimal 1: " + bigDecimal1);

        BigDecimal bigDecimal2 = new BigDecimal("987654321098.123456");
        IO.println("BigDecimal 2: " + bigDecimal2);

        //Sum of two BigDecimals
        BigDecimal sum = bigDecimal1.add(bigDecimal2);
        IO.println("Sum: " + sum); //Sum of the two BigDecimals is: 1111111110110.687777

        //Difference of two BigDecimals
        BigDecimal difference = bigDecimal1.subtract(bigDecimal2);
        IO.println("Difference: " + difference); //Difference of the two BigDecimals is: -864197531085.559135

        //Product of two BigDecimals
        BigDecimal product = bigDecimal1.multiply(bigDecimal2);
        IO.println("Product: " + product); //Product of the two BigDecimals is: 121932631137158481730656.679598813376

        //Quotient of two BigDecimals
        BigDecimal quotient = bigDecimal1.divide(bigDecimal2, BigDecimal.ROUND_HALF_UP);
        IO.println("Quotient: " + quotient); //Quotient of the two BigDecimals is: 0.125000
    }
}
