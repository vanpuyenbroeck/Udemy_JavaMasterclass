package Chapter4;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-1);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / 60 / 24;
            long years =  days / 365;
            System.out.println(minutes + " min = " + years + " y and " + days % 365 + " d");
        }

    }
}
