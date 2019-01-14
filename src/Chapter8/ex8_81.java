package Chapter8;

import java.util.Arrays;

public class ex8_81 {

    public static void main(String[] args) {

        int[] testArray = {1, 4, 7, 234, 5};

        System.out.println("Original array: " + Arrays.toString(testArray));

        reverse(testArray);
        System.out.println("Reversed array: " + Arrays.toString(testArray));
    }

    private static void reverse(int[] array) {

        int maxLength = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxLength - i];
            array[maxLength - i] = temp;
        }
    }
}
