package ch3_fundamentals_programming_structures_in_java;

public class Arrays {
    static void main() {
        int[] myArray = new int[5];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;

        traditionalForLoop(myArray);
        forEachLoop(myArray);
    }

    private static void traditionalForLoop(int[] myArray) {
        IO.println("Traditional for loop:");
        for(int x = 0; x < myArray.length; x++) {
            IO.println("Element in position %d has value %d".formatted(x, myArray[x]));
        }
    }

    private static void forEachLoop(int[] myArray) {
        IO.println("For-each loop:");
        int index = 0;
        for(int element : myArray) {
            IO.println("Element in position %d has value %d".formatted(index, element));
            index++;
        }
    }
}
