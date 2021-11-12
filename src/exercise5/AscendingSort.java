package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
           for (int ix = 0; ix < numbers.length - 1; ix++) {
           int minIndex = ix;
           for (int i = ix + 1; i < numbers.length; i++ ) {
            if (numbers[minIndex] > numbers[i]) {
              minIndex = i;

            }
          }
          int temp = numbers[ix];
          numbers[ix] = numbers[minIndex];
          numbers[minIndex] = temp;
        }
        // Sort numbers in ascending order

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
