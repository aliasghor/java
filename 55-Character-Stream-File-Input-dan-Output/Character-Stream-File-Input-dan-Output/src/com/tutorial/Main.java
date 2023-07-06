package com.tutorial;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // membuka file
        // byte stream -> FileInputStream
        // character stream -> FileReader
        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader characterFileInput = new FileReader("input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
        FileWriter characterFileOutput = new FileWriter("outputChar.txt");

        // membaca file
        // byte file
        int buffer = byteFileInput.read();

        do {
            System.out.print((char)buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        } while(buffer != -1);

        System.out.println("\n");

        // char file
        buffer = characterFileInput.read();

        do {
            System.out.print((char)buffer);
            characterFileOutput.write(buffer);
            buffer = characterFileInput.read();
        } while(buffer != -1);

        // menutup file
        byteFileInput.close();
        characterFileInput.close();

        byteFileOutput.close();
        characterFileOutput.close();


    }
}