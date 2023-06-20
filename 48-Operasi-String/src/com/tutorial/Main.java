package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String gerry = "Gerry Ganteng";
        System.out.println(gerry);

        // Mengambil komponen dari string
        System.out.println(gerry.charAt(6));

        // Substring
        String kata = gerry.substring(6,13);
        System.out.println(kata);

        String kalimat = "gw Ganteng abiezz";
        System.out.println(kalimat);

        // Concatenation (conat)
        String kalimat2 = kalimat + " Yombekk";
        System.out.println(kalimat2);

        kata = kata + " Abiezz";
        System.out.println(kata);

        // Concat dengan non string
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah;
        System.out.println(kalimat3);

        // lowercase dan uppercase
        System.out.println("Upper cae = " + kalimat.toUpperCase());
        System.out.println("Lower case = " + kalimat.toLowerCase());

        // Replace
        String kalimat4 = kalimat.replace("abiezz","Gerry");
        System.out.println(kalimat4);

        // Compare
        String orang1 = "Gerry"; // a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p
        String orang2 = "Pace";
        System.out.println(orang1.compareTo(orang2));

        String orang3 = "Slamet";
        String orang4 = "Selamat";
        System.out.println(orang3.compareTo(orang4));


        // Equality
        // String kataInput = "test"; // Ini ada di string pool
        String kataInput = new String("test"); // ini bukan string literal dan tidak ada didalam string pool
        String kataTest = "test";

        if(kataInput == kataTest) {
            System.out.println("Sama");
        } else {
            System.out.println("Beda");
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Mengambil input string dari user: ");
        kataInput = input.next(); // tidak di string pool
        System.out.println("Input user = " + kataInput);
        kataTest = "test";

        if(kataInput.equals(kataTest)) {
            System.out.println("Sama");
        } else {
            System.out.println("Beda");
        }

        // Comparasi

    }
}