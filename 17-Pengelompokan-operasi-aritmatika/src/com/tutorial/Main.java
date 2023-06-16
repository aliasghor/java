package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hasil = 5 * 10 + 2;
        System.out.println(hasil);

        hasil = 10 - 5 * 10;
        System.out.println(hasil);

        hasil = -10 + 50 * 20;
        System.out.println(hasil);

        hasil = (10 + 5) * 5;
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Menghitung Persamaan Kuadrat");
        int m,x,c,y;
        System.out.print("Nilai x = ");
        x = userInput.nextInt();
        System.out.print("gradient m = ");
        m = userInput.nextInt();
        System.out.print("bias c = ");
        c = userInput.nextInt();
        y = m * x * x + c;
        System.out.println("Nilai y = " + y);
    }
}