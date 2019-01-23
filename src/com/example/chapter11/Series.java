package com.example.chapter11;

public class Series {

    public static String nSum(int n) {
        StringBuilder series = new StringBuilder("0");
        for (int i = 1; i <= n; i++) {
            series.append(", ").append(i);
        }
        return series.toString();
    }

    public static String factorial(int n) {
        StringBuilder series = new StringBuilder("0");
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = (factorial * i);
            series.append(", ").append(factorial);
        }
        return series.toString();
    }

    public static String fibonacci(int n) {
        StringBuilder series = new StringBuilder("0");
        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < n-1; i++) {
            int sum = (n1 + n2);
            series.append(", ").append(sum);
            n1 = n2;
            n2 = sum;
        }
        return series.toString();
    }
}
