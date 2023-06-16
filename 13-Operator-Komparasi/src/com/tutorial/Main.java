package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // Operator equal
        byte a,b;
        a = 10;
        b = 10;
        boolean hasilKomparasi;
        hasilKomparasi = (a == b); 
        System.out.printf("Apakah %d == %d hasilnya adalah: %s\n",a,b,hasilKomparasi);

        a = 11;
        b = 10;
        hasilKomparasi = (a == b); 
        System.out.printf("Apakah %d == %d hasilnya adalah: %s\n",a,b,hasilKomparasi);

        // Operator not equal
        a = 10;
        b = 10;
        hasilKomparasi = (a != b); 
        System.out.printf("Apakah %d != %d hasilnya adalah: %s\n",a,b,hasilKomparasi);

        a = 11;
        b = 10;
        hasilKomparasi = (a != b); 
        System.out.printf("Apakah %d != %d hasilnya adalah: %s\n",a,b,hasilKomparasi);

        // Operator less than
        a = 10;
        b = 10;
        hasilKomparasi = (a < b); 
        System.out.printf("Apakah %d < %d hasilnya adalah: %s\n",a,b,hasilKomparasi);

        a = 11;
        b = 10;
        hasilKomparasi = (a < b); 
        System.out.printf("Apakah %d < %d hasilnya adalah: %s\n",a,b,hasilKomparasi);

        // Operator Greater than
        a = 10;
        b = 10;
        hasilKomparasi = (a > b); 
        System.out.printf("Apakah %d > %d hasilnya adalah: %s\n",a,b,hasilKomparasi);

        a = 11;
        b = 10;
        hasilKomparasi = (a > b); 
        System.out.printf("Apakah %d > %d hasilnya adalah: %s\n",a,b,hasilKomparasi);

        // Operator less than equal
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b); 
        System.out.printf("Apakah %d <= %d hasilnya adalah: %s\n",a,b,hasilKomparasi);

        a = 11;
        b = 10;
        hasilKomparasi = (a <= b); 
        System.out.printf("Apakah %d <= %d hasilnya adalah: %s\n",a,b,hasilKomparasi);

        // Operator Greater than equal
        a = 10;
        b = 10;
        hasilKomparasi = (a >= b); 
        System.out.printf("Apakah %d >= %d hasilnya adalah: %s\n",a,b,hasilKomparasi);

        a = 11;
        b = 10;
        hasilKomparasi = (a>= b); 
        System.out.printf("Apakah %d >= %d hasilnya adalah: %s\n",a,b,hasilKomparasi);

        char x,y;
        x = 'c';
        y = 'c';
        boolean hasil;
        hasil = (x == y);
        System.out.printf("Apakah %s == %s hasilnya adalah: %s",x,y,hasil);
    }
}