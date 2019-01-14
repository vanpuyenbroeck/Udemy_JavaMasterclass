package Chapter4;

public class ex4_34_6 {
    public static boolean hasTeen(int num1, int num2, int num3) {

        if ((num1 >= 13) && (num1 <= 19)) {
            return true;
        }
        if ((num2 >= 13) && (num2 <= 19)) {
            return true;
        }
        if ((num3 >= 13) && (num3 <= 19)) {
            return true;
        }
        return false;
    }
}
