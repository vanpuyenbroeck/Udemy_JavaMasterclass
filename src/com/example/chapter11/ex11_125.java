package com.example.chapter11;

import java.util.Scanner;

public class ex11_125 {

    public static void main(String[] args) {
        System.out.println("Input number: ");
        X x = new X(new Scanner(System.in));
        x.x();
    }

    public static class X {
        private int x;

        public X(Scanner x) {
            this.x = x.nextInt();
        }

        public void x() {
            for (int x = 1; x < 13; x++) {
                System.out.println(x + " times " + this.x + " is " + this.x*x);
            }
        }
    }
}
