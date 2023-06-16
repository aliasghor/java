package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte gerry;

        System.out.print("Masukan angka tebakan: ");
        gerry = (byte)input.nextInt();

        if(gerry == 6) {
            System.out.println("Yak benar sekali jawabannya = " + gerry);
        } else {
            System.out.println("Salah jawabnnya bukan = " + gerry);
        }
        }
    }