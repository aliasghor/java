package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array2D = {{1,2,3,4,5},{6,7,8,9,10}};

        System.out.println(array2D);
        System.out.println(array2D[0]);
        System.out.println(array2D[1]);
        print("Array multi dimensi = ",array2D);
        System.out.print("\n");

        char[] arrayChar1 = {'a','b','c'};
        char[] arrayChar2 = {'d','e'};

        char[][] arrayChar2D = {arrayChar1,arrayChar2};
        System.out.println(arrayChar2D);
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar1)));
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar2)));
        System.out.println(Arrays.toString(arrayChar2D));
        print("Array char multi dimensi = ",arrayChar2D);
    }
    private static void print(String message,char[][] array2D) {
        System.out.println(message + Arrays.deepToString(array2D));
    }

    private static void print(String message,int[][] array2D) {
        System.out.println(message + Arrays.deepToString(array2D));
    }
}