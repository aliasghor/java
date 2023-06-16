package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y,hasil;
        String operator;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka pertama: ");
        x = input.nextInt();
        System.out.print("Masukan Operatornya(+,-,*,/): ");
        operator = input.next();
        System.out.print("Masukan angka kedua: ");
        y = input.nextInt();

        switch(operator) {
            case "+":
            hasil = (x + y);
            System.out.printf("Hasil = %s\n",hasil);
            break;
            case "-":
            hasil = (x - y);
            System.out.printf("Hasil = %s\n",hasil);
            break;
            case "*":
            hasil = (x * y);
            System.out.printf("Hasil = %s\n",hasil);
            break;
            case "/":
            hasil = (x / y);
            System.out.printf("Hasil = %s\n",hasil);
            break;
            default:
            System.out.printf("Operator %s tidak ditemukan\n",operator);
        }
    }
}