package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan nilai: ");
        int nilai = input.nextInt();
        int nilai_fibonaci = fibonaci(nilai,"Atas");
        System.out.println("fibonaci ke = " + nilai + " adalah " + nilai_fibonaci);

    }
    private static int fibonaci(int parameter,String daun) {
        System.out.println("Daun " + daun);
        System.out.println("Fibonaci ke = " + parameter);
        if(parameter == 1 || parameter == 0) {
            return parameter;
        }
        else {
            return fibonaci(parameter - 1,"Kiri") + fibonaci(parameter - 2,"Kanan");
        }
    }
}