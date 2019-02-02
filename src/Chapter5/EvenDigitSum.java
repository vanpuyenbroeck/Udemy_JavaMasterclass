package Chapter5;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int lastNum = 0;
        int sum = 0;
        while (number > 0) {
            lastNum = number % 10;
            number /= 10;
            if (lastNum % 2 == 0) {
                sum += lastNum;
            }
        }
        return sum;
    }
}
