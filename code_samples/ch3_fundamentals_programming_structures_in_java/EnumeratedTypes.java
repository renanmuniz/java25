package ch3_fundamentals_programming_structures_in_java;

public class EnumeratedTypes {

    enum Size {
        SMALL,
        MEDIUM,
        LARGE
    }

    void main() {
        Size shirtSize = Size.MEDIUM;
        System.out.println("Shirt size: " + shirtSize); //Shirt size: MEDIUM

        //Size smallSize = 'S'; //incompatible types: char cannot be converted to EnumeratedTypes.Size
    }

}
