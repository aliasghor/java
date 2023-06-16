package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // Operasi aritmatika
        // Penjumlahan
        int variabel1 = 5;
        int variabel2 = 10;

        int hasil;

        hasil = variabel1 + variabel2;
        System.out.println("Hasil Jumlah tambah dari varibel 1 dan 2 sama dengan = " + hasil);

        // pengurangan
        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d\n",variabel1,variabel2,hasil);

        // perkalian
        hasil = variabel1 * variabel2;
        System.out.printf("%d x %d = %d\n",variabel1,variabel2,hasil);

        // perkalian
        hasil = variabel1 / variabel2;
        System.out.printf("%d : %d = %d\n",variabel1,variabel2,hasil);

        float x = 10f;
        float y = 5f;
        float result = x / y;

        System.out.printf("%e : %e = %e\n",x,y,result);
        System.out.printf("%f : %f = %f\n",x,y,result);
        System.out.printf("%g : %g = %g\n",x,y,result);

        // Modulus (Sisa Pembagian)

        float a = 11f;
        float b = 5f;

        float result2 = a % b;

        System.out.printf("%f %% %f = %f",a,b,result2);




        /*
         * 1. penjumlahan
         * 2. pengurangan
         * 3.perkalian
         * 4.pembagian
         * 5.modulus
         */
    }
}