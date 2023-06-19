package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrixA = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrixB = {{10,11,12},{13,14,15},{16,17,18}};
        print(matrixA);
        print(matrixB);

        int[][] hasil = tambah(matrixA,matrixB);
        print(hasil);

        // Perkalian matrix
        int[][] matrixC = {{1,2},{3,4},{5,6}};
        int[][] matrixD = {{11,12},{13,14}};

        int[][] hasilKali = kali(matrixC,matrixD);
        print(hasilKali);
    }
    private static int[][] kali(int[][] matrix1, int[][] matrix2) {
        int baris1 = matrix1.length;
        int kolom1 = matrix1[0].length;

        int baris2 = matrix2.length;
        int kolom2 = matrix2[0].length;

        int[][] hasil = new int[baris1][kolom2];

        int buffer;

        for(int i = 0; i < baris1; i++) {
            for(int j = 0; j < kolom2; j++) {
                buffer = 0;
                for(int k = 0; k < kolom1; k++) {
                    buffer += matrix1[i][k] * matrix2[k][j];
                }
                hasil[i][j] = buffer;
            }
        }
        return hasil;
    }

    private static int[][] tambah(int[][] matrix1, int[][] matrix2) {
        int barisA = matrix1.length;
        int kolomA = matrix1[0].length;
        
        int barisB = matrix2.length;
        int kolomB = matrix2[0].length;

        int[][] hasil = new int[barisA][kolomA];
        
        if(barisA == barisB && kolomA == kolomB) {
            for(int i = 0; i < barisA; i++) {
                for(int j = 0; j < kolomA; j++) {
                    hasil[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        } else {
            System.out.println("Jumlah baris atau kolom tidak sama");
        }
        return hasil;
    }

    private static void print(int[][] dataArray){
            int baris = dataArray.length;
            int kolom = dataArray[0].length;

            for(int i = 0; i < baris; i++){
                System.out.print("[");
                for (int j = 0; j < kolom; j++){
                    System.out.print(dataArray[i][j]);

                    if (j < (kolom - 1)){
                        System.out.print(",");
                    } else {
                        System.out.print("]");
                    }

                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
}