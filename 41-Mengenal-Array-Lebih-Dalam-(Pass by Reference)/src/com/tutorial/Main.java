package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Mengenal array lebih dalem
        int angkaArray1[] = {1,2,3,4,5};
        int angkaArray2[] = new int[5];

        angkaArray2 = angkaArray1;
        System.out.println("Array pertama = " + angkaArray1);
        System.out.println("Array kedua = " + angkaArray2);

        System.out.println("Array = " + Arrays.toString(angkaArray1));
        System.out.println("Array kedua = " + Arrays.toString(angkaArray2));

        angkaArray2[0] = 100;
        angkaArray1[1] = 10;
        System.out.println("Array Pertama setelah dirubah = " + Arrays.toString(angkaArray2));
        System.out.println("Array Kedua setelah dirubah = " + Arrays.toString(angkaArray2));

        ubahArray(angkaArray1);
        System.out.println("Array pertama setelah berubah = " + Arrays.toString(angkaArray1));
        System.out.println("Array kedua setelah berubah = " + Arrays.toString(angkaArray2));
        }
        private static void ubahArray(int dataArray[]) {
            System.out.println(dataArray[0] = 125);
        }
    }