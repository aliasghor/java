package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Merubah array menjadi string
        System.out.println("\nMerubah array menjadi string\n=====================");
        int arrayAngka1[] = {1,2,3,4,5};
        print(arrayAngka1);

        // Mengcopy array
        System.out.println("\nMengcopy array\n=====================");
        int arrayAngka2[] = new int[5];
        print(arrayAngka1);
        print(arrayAngka2);

        System.out.println("\nMengcopy dengan loop");
        for(int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        print(arrayAngka1);
        System.out.println(arrayAngka1);
        print(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\nMengcopy menggunakan copyOf");
        int arrayAngka3[] = Arrays.copyOf(arrayAngka1,5);
        print(arrayAngka1);
        System.out.println(arrayAngka1);
        print(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\nMengcopy dengan menggunakan copyOfRange");
        int arrayAngka4[] = Arrays.copyOfRange(arrayAngka1,1,4);
        print(arrayAngka1);
        System.out.println(arrayAngka1);
        print(arrayAngka4);
        System.out.println(arrayAngka4);

        // Fill array
        System.out.println("\nFill array\n=======================");

        int arrayAngka5[] = new int[10];
        print(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        print(arrayAngka5);

        // Komparasi array
        int arrayAngka6[] = {1,2,3,4,5};
        int arrayAngka7[] = {1,2,5,4,5};

        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        System.out.println("\ncek array mana yg lebih besar");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        System.out.println("\ncek array mana yg beda");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        // Search array
        System.out.println("\nSearch array\n===================");
        int arrayAngka8[] = {3,2,1,4,5,6,87,4,3};
        int angka = 87;
        Arrays.sort(arrayAngka8);
        print(arrayAngka8);
        int position = Arrays.binarySearch(arrayAngka8,87);
        System.out.println("Angka " + angka + " Ada diposisi " + position);

    }
    private static void print(int dataArray[]) {
        System.out.println("Array = " + Arrays.toString(dataArray));
    }
}