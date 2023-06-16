package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // For loop
        System.out.println("Awal program");

        for(int i = 0; i <= 10; i++) {
            System.out.println("For loop ke = " + i);
        }
        System.out.println("Looping kedua");
        for(int i = 0; i <= 10; i++) {
            System.out.println("For loop ke = " + i);
        }

        System.out.println("Looping ketiga");
        for(int i = 10; i >= 0; i--) {
            System.out.println("For loop ke = " + i);
        }

        System.out.println("Looping keempat");
        int i = 0;
        for(; i <= 10;) {
            System.out.println("For loop ke = " + i);
            i++;
        }

        System.out.println("Akhir program");
    }
}