package com.tutorial;

public class Main {
    public static void main(String[] args) {
        print(5);
        print(5.5f);
        print(5.5d);
        print(150000L);

        System.out.println("Hasil pejumlahan nilai integer = " + jumlah(5,5));
        System.out.println("Hasil pejumlahan nilai float = " + jumlah(5.5f,5));
        System.out.println("Hasil pejumlahan nilai float = " + jumlah(5,5.5f));
    }
   private static float jumlah(int angka1,float angka2) {
    return angka1 + angka2;
   }

   private static float jumlah(float angka1, int angka2) {
    return angka1 + angka2;
   }

    private static int jumlah(int angka1,int angka2) {
        return angka1 + angka2;
    }

    private static void print(long nilaiLong) {
        System.out.println("Nilai long = " + nilaiLong);
    }

    private static void print(double nilaiDouble) {
        System.out.println("Angka double = " + nilaiDouble);
    }

    private static void print(float nilaiFloat) {
        System.out.println("Angka float = " + nilaiFloat);
    }

    private static void print(int nilaiInt) {
        System.out.println("Angka ini adalah integer dengan nilai " + nilaiInt);
    }
}