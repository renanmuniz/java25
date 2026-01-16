package ch3_fundamentals_programming_structures_in_java;

public class CharUnicodeExample {
    static void main() {
        char copyrightSymbol = '\u00A9';
        char smileyFace = '\u263A';
        char accentedE = '\u00E9';
        char letterA = '\u0041';
        char letterB = '\u0042';
        char numberOne = '\u0031';

        System.out.println("Copyright Symbol: " + copyrightSymbol);
        System.out.println("Smiley Face: " + smileyFace);
        System.out.println("Accented E: " + accentedE);
        System.out.println("Letter A: " + letterA);
        System.out.println("Letter B: " + letterB);
        System.out.println("Number One: " + numberOne);
    }
}
