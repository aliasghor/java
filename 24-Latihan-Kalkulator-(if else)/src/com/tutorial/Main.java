package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Latihan kalulator if else
        Scanner input = new Scanner(System.in);
        float a,b,hasil;
        char operator;

        System.out.print("Masukan angka kesatu: ");
        a = input.nextFloat();
        System.out.print("Masukan operasinya (+,-,x,:): ");
        operator = input.next().charAt(0);
        System.out.print("Masukan angka kedua: ");
        b = input.nextFloat();

        if(operator == '+') {
            hasil = (a + b);
            System.out.println("Hasilnya = " + hasil);
        } else if(operator == '-') {
            hasil = (a - b);
            System.out.println("Hasilnya = " + hasil);
        } else if(operator == '*' || operator == 'x') {
            hasil = (a * b);
            System.out.println("Hasilnya = " + hasil);
        } else if(operator == '/' || operator == ':') {
            if(b == 0) {
                System.out.println("Jika seluruh angka dibagi = 0 hasilnya tidak terdefinisi");
            } else {
                hasil = (a / b);
                System.out.println("Hasilnya = " + hasil);
            }
        } else {
            System.out.println("Operator tidak ditemukan");
        }
    }
}