package Chapter8;

import java.util.Scanner;

public class ex8_80 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many integers in list?");
        int count = scanner.nextInt();

        System.out.println("Input "+ count + " numbers:");
        int[] arrayInput = readIntegers(count);

        System.out.println("Minimum is: " + findMin(arrayInput));

    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
        return array;
    }

    private static int findMin(int[] array) {

        int min = array[0];

        for (int item : array) {
            if (item < min) {
                min = item;
            }
        }

        return min;
    }
}
