package Chapter5;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        int num2copy = num2;
        int temp1 = 0;
        int temp2 = 0;

        while (num1 > 0) {
            temp1 = num1 % 10;
            num1 /= 10;
            while (num2copy > 0) {
                temp2 = num2copy % 10;
                num2copy /= 10;
                if (temp1 == temp2) {
                    return true;
                }
            }
            num2copy = num2;
        }
        return false;
    }
}
