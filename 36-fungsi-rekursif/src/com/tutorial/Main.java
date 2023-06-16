package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai: ");
        int hasil = input.nextInt();
        System.out.println("Anda memasukan nilai: " + hasil);

        rekursif(hasil);
        int result = jumlah(hasil);
        System.out.printf("Jumlah = %d\n",result);

        result = faktorial(hasil);
        System.out.printf("Jumlah = %d\n",result);
    }

    private static int faktorial(int parameter) {
        System.out.println("Parameter = " + parameter);
        if(parameter == 1) {
            return parameter;
        }
        return parameter * faktorial(parameter - 1);
    }

    private static int jumlah(int parameter) {
        System.out.println("Parameter = " + parameter);
        if(parameter == 0) {
            return parameter;
        }
        return parameter + jumlah(parameter - 1);
    }

    private static void rekursif(int parameter) {
        System.out.printf("Nilai = %d\n",parameter);
        if(parameter == 0) {
            return;
        }
        parameter--;
        rekursif(parameter);
    }
}