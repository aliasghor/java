package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Membuat string
        String kataString = "Hallo";
        char[] kataChar = {'H','a','l','l','o'};

        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        // Mengakses komponen dari string
        System.out.println("Komponen pertama = " + kataString.charAt(0));
        System.out.println("Index pertama dari char = " + kataChar[0]);

        // Merubah komponen dari string = tidak bisa
        // kataString[0] = "G";
        kataChar[0] = 'G';
        System.out.println(Arrays.toString(kataChar));

        // Merubah komponen secara tidak langsung
        print("Kata string",kataString);
        kataString = "c" + kataString.substring(1,4);
        System.out.println(kataString);
        print("Kata string",kataString);

        // Memori dari string
        String str_1 = "Hallo";
        String str_2 = "test";
        String str_3 = "testing";

        print("str_1",str_1);
        print("Str_2",str_2);
        print("Str_3",str_3);

        str_3 = str_3.substring(0,4);
        print("str_3 updated",str_3);

        String str_4 = "Gerry";
        print("str_4",str_4);

        str_4 = "Gerry";
        print("kata string",str_4);


    }
    private static void print(String message, String data) {
        int addres = System.identityHashCode(data);
        System.out.println(message + " = " + data + " Addres = " + Integer.toHexString(addres));
    }
}