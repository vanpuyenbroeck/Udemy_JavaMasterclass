package Chapter5;

public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverse = reverse(number);
        int zeroes = (getDigitCount(number) - getDigitCount(reverse));

        int lastDigit = 0;
        while (reverse > 0) {
            lastDigit = reverse % 10;
            reverse /= 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }

        for (int i = 0; i < zeroes; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        boolean negative = false;
        if (number < 0) {
            negative = true;
            number *= -1;
        }
        int reverse = 0;
        while (number > 0) {
            int last = number % 10;
            number /= 10;
            reverse *= 10;
            reverse += last;
        }
        if (negative) {
            return reverse*-1;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int length = 0;
        while (number > 0) {
            number /= 10;
            length++;
        }
        return length;
    }
}
