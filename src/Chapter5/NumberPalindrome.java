package Chapter5;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = number;

        if (number < 0) {
            num *= -1;
        }

        while (num > 0) {
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }

        if (number < 0) {
            reverse *= -1;
        }

        return (number == reverse);
    }
}
