package Chapter4;

public class ex4_34_4 {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        return (Math.abs(firstNumber - secondNumber) <= 0.0009);

    }
}
