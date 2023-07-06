package com.tutorial;
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // Membaca file
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
        bufferedReader.mark(200);

        // Membaca kedalam string
        String data = bufferedReader.readLine();
        System.out.println(data);

        // Membaca ke dalam char
        bufferedReader.reset();
        char[] dataChar = new char[20];
        bufferedReader.read(dataChar,0,dataChar.length);
        System.out.println(Arrays.toString(dataChar));

        // Membaca kedalam baris
        bufferedReader.reset();
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

        // Menulis file
        FileWriter fileOutput = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);

        bufferedReader.reset();
        String baris1 = bufferedReader.readLine();

        bufferedWriter.write(baris1,0,baris1.length());
        bufferedWriter.flush();

        // Menambah new line
        bufferedWriter.newLine();

        String baris2 = bufferedReader.readLine();

        bufferedWriter.write(baris2,0,baris2.length());
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
        fileOutput.close();
        fileInput.close();
    }
}