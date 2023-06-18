package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5};
        int array2[] = {6,7,8,9,10};

        // Penjumlahan dua buah array
        int[] arrayHasil1 = tambah(array1,array2);
        print("Array = ",array1);
        print("Array = ",array2);
        print("hasil penjumlahan antar 2 array = ",arrayHasil1);

        // Menggabungkan dua buah array
        int[] arrayHasil2 = new int[array1.length + array2.length];

        for(int i = 0; i < array1.length; i++) {
            arrayHasil2[i] = array1[i];
        }

        for(int j = 0; j < array2.length; j++) {
            arrayHasil2[j + array1.length] = array2[j];
        }
        print("Hasil Array setelah digabung = ",arrayHasil2);

        // Sorting reverse
        reverse(array1);
        print("Array reversed 1 = ",array1);

        reverse2(array2);
        print("Array reversed 2 = ",array2);


    }
    private static void reverse2(int[] dataArray) {
        Arrays.sort(dataArray);
        int buffer;
        for(int i = 0; i < dataArray.length / 2; i++) {
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }

    private static void reverse(int[] array) {
        Arrays.sort(array);
        int[] arrayReversed = Arrays.copyOf(array,array.length);
        for(int i = 0; i < array.length; i++) {
            array[i] = arrayReversed[(arrayReversed.length - 1) - i];
        }
    }

    private static int[] tambah(int[] arrayInt1,int[] arrayInt2) {
        int[] arrayHasil = new int[arrayInt1.length];
        for(int i = 0; i < arrayInt1.length; i++) {
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }

    private static void print(String message,int array[]) {
        System.out.println(message + Arrays.toString(array));
    }
}