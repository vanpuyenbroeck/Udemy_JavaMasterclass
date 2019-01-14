package Chapter4;

public class ex4_34_2 {

    public static boolean bark(boolean barking, int hourOfDay) {
        if ((hourOfDay >= 0) && (hourOfDay < 24)) {
            if (barking) {
                return (hourOfDay > 22) || (hourOfDay < 8);
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
