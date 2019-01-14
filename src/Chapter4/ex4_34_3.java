package Chapter4;

public class ex4_34_3 {

    public static boolean isLeapYear(int year) {
        if ((year > 0) && (year <= 9999)) {
            if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)) {
                return true;
            }
            else {
                return false;
            }
        } else {
            return false;
        }
    }
}
