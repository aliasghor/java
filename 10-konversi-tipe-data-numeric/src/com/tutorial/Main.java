package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // program untuk konversi data
        int nilai = 450;
        System.out.println("Nilai int = " + nilai);

        // Memperluas rentang tipe data
        long nilaiLong = nilai;
        System.out.println("Nilai long = " + nilaiLong);

        // memperkecil rentang tipe data
        byte nilaiByte = (byte)nilai;
        System.out.println("Nilai byte = " + nilaiByte);
        System.out.println("Nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai max byte = " + Byte.MIN_VALUE);

        // casting pembagian
        int x = 10;
        float y = 4;

        float z = x / y;
        System.out.printf("%d : %f = %f\n",x,y,z);

        int a = 10;
        int b = 4;

        float c = (float)a / b;
        System.out.printf("%d : %d = %f ",a,b,c);

    }
}