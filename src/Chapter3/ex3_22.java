package Chapter3;

public class ex3_22 {
    public static void main(String[] args) {
        double firstNumber = 20d;
        double secondNumber = 80d;
        double result = (firstNumber + secondNumber) * 25;
        double remainderAfterDividingBy40 = result % 40;
        if (remainderAfterDividingBy40 <= 20) {
            System.out.println(remainderAfterDividingBy40);
            System.out.println("Total was over the limit");
        }
    }
}
