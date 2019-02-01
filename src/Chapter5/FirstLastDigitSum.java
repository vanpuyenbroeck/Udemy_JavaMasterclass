package Chapter5;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int first = 0;
        int last = number % 10;
        while (number > 0) {
            first = number;
            number /= 10;
        }
        return first + last;
    }
}
