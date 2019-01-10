import java.util.Scanner;

public class ex5_51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number #" + i + ":");
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();
            System.out.println("Invalid number");
        }
        scanner.close();
        System.out.println("Sum is: " + sum);
    }
}
