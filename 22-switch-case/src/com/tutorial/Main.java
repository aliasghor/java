package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Switch case
        String input;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukan nama: ");
        input = inputUser.next();

        switch(input) {
            case "Gerry":
                System.out.printf("Hi %s",input);
                break;
            case "Pace":
                System.out.printf("Hi: %s",input);
                break;
            default:
                System.out.printf("Please input the username either it is a gerry or pace\n");
        }

    }
}