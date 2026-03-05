package ch3_fundamentals_programming_structures_in_java;

public class Arrays {
    static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;

        traditionalForLoop(myArray);
        forEachLoop(myArray);
        arrayCopying();
        mainCommandLineArguments(args);
        arraySorting();
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

    private static void arrayCopying() {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = originalArray;

        // Modifying the copied array will affect the original array because they reference the same array in memory.
        copiedArray[0] = 10;
        IO.println("Original array after modifying copied array:");
        for(int element : originalArray) {
            IO.println(element); // Output will show 10, 2, 3, 4, 5 because originalArray and copiedArray reference the same array.
        }

        int[] originalArray2 = {1, 2, 3, 4, 5};
        // Copying the array using copyOf method to create a new array with the same contents.
        int[] newCopiedArray = java.util.Arrays.copyOf(originalArray2, originalArray2.length);
        newCopiedArray[0] = 20;
        IO.println("Original array after modifying new copied array:");
        for(int element : originalArray2) {
            IO.println(element); // Output will show 1, 2, 3, 4, 5 because originalArray2 and newCopiedArray reference different arrays in memory.
        }

        IO.println("After modifying copied array:");
        for(int element : newCopiedArray) {
            IO.println(element); // Output will show 20, 2, 3, 4, 5 because newCopiedArray was modified.
        }
    }

    private static void arraySorting() {
        int[] unsortedArray = {5, 2, 8, 1, 3};
        IO.println("Unsorted array:");
        for (int element : unsortedArray) {
            IO.println(element); // Output will show 5, 2, 8, 1, 3
        }

        java.util.Arrays.sort(unsortedArray);
        IO.println("Sorted array:");
        for (int element : unsortedArray) {
            IO.println(element); // Output will show 1, 2, 3, 5, 8
        }
    }

    private static void mainCommandLineArguments(String[] args) {
        IO.println("Command-line arguments:");
        for(int i = 0; i < args.length; i++) {
            IO.println("Argument %d: %s".formatted(i, args[i]));
        }
    }

    private static void multiDimensionalArrays() {
        //TODO: Implement multi-dimensional arrays example
    }
}
