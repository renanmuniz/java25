package ch3_fundamentals_programming_structures_in_java;

public class Loops {
    static void main() {
        //While loop
        int i = 1;
        while(i <= 5) {
            IO.println("While loop iteration: " + i);
            i++;
        }

        //Do-while loop
        int j = 1;
        do {
            IO.println("Do-while loop iteration: " + j);
            j++;
        } while(j <= 5);

        //Do-while loop with condition false to demonstrate it executes at least once
        int k = 10;
        do {
            IO.println("This will execute at least once even though k is: " + k);
            k++;
        } while(k <= 5);

        //For loop
        for(int m = 1; m <= 5; m++) {
            IO.println("For loop iteration: " + m);
        }

        //Enhanced for loop (for-each loop) to iterate over an array
        int[] numbers = {1, 2, 3, 4, 5};
        for(int num : numbers) {
            IO.println("Enhanced for loop iteration: " + num);
        }
    }
}
