package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ternary operator
        int hasil,input;


        Scanner userInput = new Scanner(System.in);
        hasil = userInput.nextInt();

        input = (hasil == 10) ? (hasil * hasil) : (hasil / 2);
        System.out.printf("Hasilnya = %f",(float)input);
    }
}