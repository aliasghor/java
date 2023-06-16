package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // nested if
        int a = 6;
        int b = 10;
        System.out.println("Ini adalah awal dari program");

        if(a == 5) {
            if(b == 10) {
                System.out.printf("Ini adalah ketika %s dan %s benar\n",a,b);
            } else {
                System.out.printf("Ini adalah ketika diantara %s dan %s salah\n",a,b);
            }
        } else {
                System.out.printf("Ini adalah ketika %s dan %s salah semua\n",a,b);
        }
        System.out.println("Akhir program");
    }
}