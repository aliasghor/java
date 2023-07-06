package com.tutorial;
import gerry.util.Pace;

public class Main {
    public static void main(String[] args) {
        // dengan access modifier public dapat diakses
        Gerry.methodPublic();

        // dengan acces modifier private tidak dapat diakses
        // Gerry.methodPrivate();

        // karena berada dalam package yang sama maka bisa diakses
        Gerry.methodDefault();

        // bisa diakses karena berada dalam pacakge yang sama
        Gerry.methodProtected();

        Pace.printPublic(); // bisa diakses
        // Pace.printPrivate(); // tidak bisa diakses
        // Pace.printDefault(); // tidak bisa diakses
        // Pace.printProteceted(); // tidak bisa diakses
    }
}