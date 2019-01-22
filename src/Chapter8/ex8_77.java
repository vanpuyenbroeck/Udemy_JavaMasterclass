package Chapter8;

import java.util.Arrays;
import java.util.Scanner;

public class ex8_77 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] input = getIntegers(5);
        printArray(input);

        int[] sortedInput = sortIntegers(input);
        System.out.println("Sorted in ascending order:");
        printArray(sortedInput);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at Node " + i + " is: " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sorted = Arrays.copyOf(array,array.length);
        Arrays.sort(sorted);
        return sorted;
    }
}
