package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int angka = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukan nilai tebakan anda: ");
        nilaiTebakan = userInput.nextInt();
        statusTebakan = (angka == nilaiTebakan);
        System.out.println("Nilai tebakan anda = " + statusTebakan);

        // Operasi aljabar boolean (and (||) or (&&))
        System.out.print("Masukan nilai diantara 4 dan 9 ");
        nilaiTebakan = userInput.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("Nilai tebakan anda = " + statusTebakan);

    }
}