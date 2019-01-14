package Chapter5;

import java.util.Scanner;

public class ex5_52 {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        boolean firstNumber = true;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int input;
            System.out.println("Enter number:");

            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (firstNumber) {
                    min = input;
                    max = input;
                    firstNumber = false;
                } else if ((input < min)) {
                    min = input;
                } else if (input > max) {
                    max = input;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        scanner.close();
    }
}
