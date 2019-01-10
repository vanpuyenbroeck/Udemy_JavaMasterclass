import java.util.Scanner;

public class ex5_52 {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;

        Scanner scanner = new Scanner(System.in);

        boolean firstNumber = true;
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
                scanner.nextLine();

            } else {
                break;
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        scanner.close();
    }
}
