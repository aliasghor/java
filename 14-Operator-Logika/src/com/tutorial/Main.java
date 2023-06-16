package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // Operator Logika = operasi yg biasa kita lakukan untuk tiep data boolean
        // And Or XOR Negasi
        // Or (||)
        boolean a,b,hasil;
        a = true;
        b = true;
        hasil = (a || b);
        System.out.printf("Hasil dari %s || %s = %s\n",a,b,hasil);
        a = true;
        b = false;
        hasil = (a || b);
        System.out.printf("Hasil dari %s || %s = %s\n",a,b,hasil);

         // And (&&)
        a = false;
        b = false;
        hasil = (a && b);
        System.out.printf("Hasil dari %s && %s = %s\n",a,b,hasil);
        a = true;
        b = false;
        hasil = (a && b);
        System.out.printf("Hasil dari %s && %s = %s\n",a,b,hasil);

        // Xor (^)
        a = true;
        b = true;
        hasil = (a ^ b);
        System.out.printf("Hasil dari %s ^ %s = %s\n",a,b,hasil);
        a = true;
        b = false;
        hasil = (a ^ b);
        System.out.printf("Hasil dari %s ^ %s = %s\n",a,b,hasil);

        // Not (!)

        boolean x,y;
        x = true;
        y = !x;
        System.out.printf("%s Ketika dikasih ! = %s\n",x,y);

        x = false;
        y = !x;
        System.out.printf("%s Ketika dikasih ! = %s\n",x,y);

    }
}