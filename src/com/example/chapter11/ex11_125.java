package com.example.chapter11;

import java.util.Scanner;

public class ex11_125 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input number: ");
        X x = new X(scanner.nextInt());
        x.x();
        scanner.close();
    }

    public static class X {
        private int x;

        public X(int x) {
            this.x = x;
        }

        public void x() {
            for (int x = 1; x < 13; x++) {
                System.out.println(x + " times " + this.x + " is " + this.x*x);
            }
        }
    }
}
