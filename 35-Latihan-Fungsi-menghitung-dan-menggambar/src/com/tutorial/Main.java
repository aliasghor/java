package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan lebar: ");
        int inputPanjang = input.nextInt();

        System.out.print("Masukan panjang: ");
        int inputLebar = input.nextInt();

        gambar(inputPanjang,inputLebar);
        show(inputPanjang,inputLebar);
    }
    private static void show(int panjang,int lebar) {
        System.out.println("Luas = " + luas(panjang,lebar));
        System.out.println("Keliling = " + keliling(panjang,lebar));
    }

    private static int keliling(int panjang,int lebar) {
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }

    private static int luas(int panjang,int lebar) {
        int hasil = (panjang * lebar);
        return hasil;
    }

    private static void gambar(int panjang,int lebar) {
        for(int i = 0; i < panjang; i++) {
            for(int j = 0; j < lebar; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}