package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Array multi dimensi dengan assignment
        int[][] array_2d = {{1,2},{3,4}};
        print("Multi dimensional array = ",array_2d);

        // Array multi dimensi dengan deklarasi
        int[][] arrayAngka = new int[5][4];
        print2D(arrayAngka);

        // // Looping secara manual
        // for(int i = 0; i < arrayAngka.length; i++) {
        //     System.out.print("[");
        //     for(int j = 0; j < arrayAngka[i].length; j++) {
        //         System.out.print(arrayAngka[i][j] + ",");
        //     }
        //     System.out.print("]\n");
        // }

        // looping dengan for each
        // for(int[] baris: arrayAngka) {
        //     System.out.print("[");
        //     for(int angka: baris) {
        //         System.out.print(angka + ",");
        //     }
        //     System.out.print("]\n");
        // }

        // Array secara manual untuk pembuktian
        int[][] array2D = {{1,2,3},{4,5,6},{7,8,9}};
        print2D(array2D);

        int[][] arrayRagged = {{1,2,3},{4,5,6,7},{8}};
        print2D(arrayRagged);
    }
    private static void print2D(int[][] array) {
        for(int[] baris: array) {
            System.out.print("[");
            for(int angka: baris) {
                System.out.print(angka + ",");
            }
            System.out.print("]\n");
        }
    }

    // private static void print2D(int[][] array) {
    //     for(int i = 0; i < array.length; i++) {
    //         System.out.println(Arrays.toString(array[i]));
    //     }
    // }

    private static void print(String message,int[][] array) {
        System.out.println(message + Arrays.deepToString(array));
    }
}