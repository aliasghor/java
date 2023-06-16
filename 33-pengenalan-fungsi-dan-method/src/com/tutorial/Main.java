package com.tutorial;

public class Main {
    public static void main(String[] args) {
        int x;
        x = hitung(10);
        System.out.println("Hasil x = " + x);

        x = hitung(5);
        System.out.println("Hasil x = " + x);

    }
    private static int hitung(int input) {
        int hasil;
        hasil = (input + 2) * 20;
        return hasil;
    }
}