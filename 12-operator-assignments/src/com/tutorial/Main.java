package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // operator assingments

        // Assignment operator jumlah
        byte a = 5;
        a += 1;
        System.out.printf("Hasil operator jumlah += %d\n",a);

        // Assignment operator pengurangan
        byte b = 5;
        b -= 1;
        System.out.printf("Hasil operator pengurangan -= %d\n",b);

        // Assignment operator perkalian
        byte c = 5;
        c *= 1;
        System.out.printf("Hasil operator pengurangan *= %d\n",c);

        // Assignment operator pembagian
        byte d = 5;
        d /= 1;
        System.out.printf("Hasil operator pengurangan /= %d\n",d);

        // Assignment operator modulus
        byte e = 5;
        e %= 1;
        System.out.printf("Hasil operator pengurangan %%= %d\n",e);
    }
}