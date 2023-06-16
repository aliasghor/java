package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int f_n,f_n_1,f_n_2,n;
        Scanner userInput = new Scanner(System.in);
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        System.out.print("Masukan nilai fibonaci ke = ");
        n = userInput.nextInt();

        for(int i = 1; i <= n;  i++) {
            System.out.println("Nilai ke i: " + i + " adalah " + f_n);
            f_n = (f_n_1 + f_n_2);
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }

    }
}