package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Latihan looping sederhana
        Scanner inputUser = new Scanner(System.in);
        int nilai_awal,nilai_akhir,total;

        System.out.print("Masukan angka pertama: ");
        nilai_awal = inputUser.nextInt();
        System.out.print("Masukan angka kedua: ");
        nilai_akhir = inputUser.nextInt();
        total = 0;

        do {
            total += nilai_awal;
            System.out.printf("Ditambah %s menjadi %s\n",nilai_awal,total);
            nilai_awal++;
        } while(nilai_awal <= nilai_akhir);

        // for(;nilai_awal <= nilai_akhir;nilai_awal++) {
        //     total += nilai_awal;
        //     System.out.printf("Ditambah %s menjadi %s\n",nilai_awal,total);
        // }

    }
}