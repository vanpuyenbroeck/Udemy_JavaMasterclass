package Chapter4;

public class IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(1,1,-1);
        printEqual(1,1,1);
        printEqual(1,2,3);
        printEqual(1,1,2);
    }

    public static void printEqual (int int1, int int2, int int3) {
        if (int1 < 0 || int2 < 0 || int3 < 0) {
            System.out.println("Invalid Value");
        }
        else if (int1 == int2 && int2 == int3) {
            System.out.println("All numbers are equal");
        }
        else if (int1 != int2 && int1 != int3 && int2 != int3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }

}
