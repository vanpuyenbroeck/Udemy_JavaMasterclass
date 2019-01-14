package Chapter3;

public class ex3_18 {
    public static void main(String[] args) {
        double numberOfPounds =  5d;
        double numberOfPoundsInOneKilogram = 0.45359237d;
        double convertedKilograms = numberOfPounds*numberOfPoundsInOneKilogram;

        System.out.println(numberOfPounds + " pounds is equal to " + convertedKilograms + " kilogram");
    }
}
