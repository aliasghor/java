package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Looping array dengan for each
        int arrayAngka[] = {1,2,3,4,5};
        System.out.println("Array = " + Arrays.toString(arrayAngka));

        // Looping standart
        System.out.println("Looping standart");
        for(int i = 0; i < 5; i++) {
            System.out.printf("Index ke %d adalah = %d\n",i,arrayAngka[i]);
        }

        // Looping dengan properti array
        System.out.println("Loping dengan properti length");
        System.out.println("Panjang array = " + arrayAngka.length);
        for(int i = 0; i < arrayAngka.length; i++) {
            System.out.printf("Index ke %d adalah = %d\n",i,arrayAngka[i]);
        }

        // Looping khusus untuk collection array
        System.out.println("Looping dengan for each");
        for(int angka: arrayAngka) {
            System.out.printf("Looping dengan for each = %d\n",angka);
        }
    }
}