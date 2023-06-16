package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // void itu artinya hampa(kosong)
        float number,result;
        number = 1.5f;
        result = simple(number);
        System.out.println("Result equals to: " + result);

        fungsiVoid("Apapun");
        panggilNama("Gerry");
        panggilNama("Pace");
    }

    private static void panggilNama(String nama) {
        System.out.println("Hi " + nama);
    }

    private static void fungsiVoid(String apapun) {
        System.out.println(apapun);
    }


    private static float simple(float angka) {
        return angka;
    }
}