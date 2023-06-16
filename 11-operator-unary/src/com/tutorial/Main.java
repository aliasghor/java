package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // unary + dan -
        int angka1 = 1;
        System.out.printf("Unary '+', %d menjadi %d\n",angka1,+angka1);
        System.out.printf("Unary '-', %d menjadi %d\n",angka1,-angka1);

        // unary Decrement dan Increment
        byte angka2 = 10;
        angka2++;
        System.out.println("A variabel if we increment or add ++ sign to it the output will be: " + angka2);

        int angka3 = 10;
        angka3--;
        System.out.println("A variabel if we  Decrement or add -- sign to it the output will be: " + angka3);

        byte a = 5;
        System.out.printf("Nilai dengan '++' prefix akan menjadi = %d\n",++a);
        byte b = 5;
        System.out.printf("Nilai dengan '++' postfix akan menjadi = %d\n",b++);
        System.out.printf("Nilai hasil dari postfix = %d\n",b);

        // Unary boolean dengan ! untuk negasi
        boolean bool = false;
        System.out.printf("Nilai boolean = %b\n",bool);
        System.out.printf("Nilai boolean Setelah ditambahkan ! = %b\n",!bool);
    }
}