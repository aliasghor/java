package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Method exception
        Scanner input = new Scanner(System.in);
        int[] array = {1,2,3,4,5};
        int angka1,angka2,hasil;

        System.out.print("Masukan angka pertama: ");
        angka1 = input.nextInt();
        System.out.print("Masukan angka kedua: ");
        angka2 = input.nextInt();

        System.out.print("Masukan index: ");
        int arr = input.nextInt();
//       exception biasa
        System.out.println("Excpetion biasa");
        try {
            hasil = angka1 / angka2;
            System.out.println(hasil);
            System.out.printf("Index %d adalah = %d",arr,array[arr]);
        }
        catch(ArithmeticException e) {
            System.err.println("Jika sebuah angka pertama dibagi 0 dengan angka kedua hasilnya tidak terdefinisi");
        }
        catch(IndexOutOfBoundsException e) {
            System.err.println("Index yg anda masukan tidak ditemukan\n");
        }

        // exception didalam fungsi
        System.out.println("exception didalam fungsi");
        int data = ambilDataArray(array,arr);
        System.out.printf("index ke %d adalah = %d\n",arr,data);

        // Exception throws method
        System.out.println("Exception throws method");
        int data2 = 0;
        try {
            data2 = data(array,arr);
        }
        catch(Exception e) {
            System.err.println(e);
        }
        System.out.printf("index ke %d adalah %d\n",arr,data2);


    }
    private static int data(int[] array, int index) throws Exception {
        int hasil = array[index];
        return hasil;
    }
    private static int ambilDataArray(int[] array, int index) {
        int hasil = 0;
        try {
            hasil = array[index];
        }
        catch(Exception e) {
            System.err.println(e);
        }
        return hasil;
    }
}