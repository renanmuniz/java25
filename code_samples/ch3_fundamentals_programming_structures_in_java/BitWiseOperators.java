package ch3_fundamentals_programming_structures_in_java;

public class BitWiseOperators {
    static void main() {
        bitWiseAnd();
        bitWiseOr();
        bitWiseXor();
        bitWiseNot();
        bitWiseShift();
        bitWiseSignedRightShift();

    }

    private static void bitWiseAnd() {
        IO.println("Bitwise AND:");
        int a = 6;   // 110
        int b = 3;   // 011

        int r = a & b; // 010 -> 2
        System.out.println("a & b = " + r); // 2
    }

    private static void bitWiseOr() {
        IO.println("Bitwise OR:");
        int a = 4; // 100
        int b = 2; // 010

        int r = a | b; // 110 -> 6
        System.out.println("a & b = " + r); // 6
    }

    private static void bitWiseXor() {
        IO.println("Bitwise XOR:");
        int a = 5; // 101
        int b = 3; // 011

        int r = a ^ b; // 110 -> 6
        IO.println("a ^ b = " + r); // 6
    }

    private static void bitWiseNot() {
        IO.println("Bitwise NOT:");
        int a = 3; // 0000 0011 in binary

        int r = ~a; //1111 1100 in binary, which is -4 in decimal (two's complement)
        IO.println("~a = " + r); // -4
    }

    private static void bitWiseShift() {
        IO.println("Bitwise Left Shift:");
        int a = 8; // 0000 1000 in binary

        int leftShift = a << 1; // 0001 0000 in binary, which is 16 in decimal
        int rightShift = a >> 1; // 0000 0100 in binary, which is 4 in decimal

        IO.println("a << 1 = " + leftShift); // 16
        IO.println("a >> 1 = " + rightShift); // 4
    }

    private static void bitWiseSignedRightShift() {
        IO.println("Bitwise Signed Right Shift:");
        int a = -8; // 1111 1000 in binary (two's complement)

        int signedRightShift = a >> 1; // 1111 1100 in binary, which is -4 in decimal
        IO.println("a >> 1 = " + signedRightShift); // -4
    }

    private static void bitWiseUnsignedRightShift() {
        IO.println("Bitwise Unsigned Right Shift:");
        int a = -8; // 1111 1000 in binary (two's complement)

        int unsignedRightShift = a >>> 1; // 0111 1100 in binary, which is 2147483644 in decimal
        IO.println("a >>> 1 = " + unsignedRightShift); // 2147483644
    }
}
