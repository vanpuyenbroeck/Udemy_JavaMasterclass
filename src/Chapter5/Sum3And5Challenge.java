package Chapter5;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if(divisibleBy3(i) && divisibleBy5(i)) {
                System.out.println(i + " is divisible by 3 AND 5");
                sum += i;
                count++;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum of all these numbers: " + sum);
    }

    private static boolean divisibleBy3(int number) {
        return (number % 3 == 0);
    }

    private static boolean divisibleBy5(int number) {
        return (number % 5 == 0);
    }
}
