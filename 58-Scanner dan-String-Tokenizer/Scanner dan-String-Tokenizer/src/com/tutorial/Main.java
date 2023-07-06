package com.tutorial;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
        Scanner scanner = new Scanner(bufferedReader);

        // cek ada ato tidak kata selanjutnya
        System.out.println(scanner.hasNext());

        // Untuk membaca kata dengan pemisah delimeter spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        System.out.println(scanner.hasNext());

        // Menggunakan delimeter tertentu
        FileReader fileinput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileinput2);
        bufferedReader.mark(200);
        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");

        do {
            System.out.println(scanner.next());
        } while(scanner.hasNext());

        // menggunakan string tokenizer
        bufferedReader.reset();
        String data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringToken = new StringTokenizer(data,",");

        do {
            System.out.println(stringToken.nextToken());
        } while(stringToken.hasMoreTokens());

        // baris kedua
        data = bufferedReader.readLine();
        System.out.println(data);

        stringToken = new StringTokenizer(data,",");

        do {
            System.out.println(stringToken.nextToken());
        } while(stringToken.hasMoreTokens());

    }
}