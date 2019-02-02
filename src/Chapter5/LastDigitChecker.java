package Chapter5;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000) {
            return false;
        }
        int last1 = num1 % 10;
        int last2 = num2 % 10;
        int last3 = num3 % 10;

        return (last1 == last2 || last1 == last3 || last2 == last3);
    }
}
