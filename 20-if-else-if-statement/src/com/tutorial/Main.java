package com.tutorial;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        // tutorial if else if statement
        System.out.println("Ini adalah awal program");
        

        // if else if statement
        System.out.print("Masukan Kata Sandi Anda: ");
        num = input.nextInt();

        if(num == 1) {
            System.out.println("Ini adalah aksi 1");
        } else if(num == 2) {
            System.out.println("Ini adalah aksi 2");
        } else {
            System.out.println("Ini adalah aksi 3");
        }

        // Akhir dari if else if program
        System.out.println("Ini adalah akhir dari program if else if program");
    }
}