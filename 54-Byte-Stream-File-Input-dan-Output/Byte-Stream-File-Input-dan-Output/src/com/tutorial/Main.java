package com.tutorial;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        FileInputStream inputFile = null;
//
//        System.out.println("File input bernilai = " + inputFile);
//
//        inputFile = new FileInputStream("input.txt");
//
//        System.out.println("File input bernilai = " + inputFile);
//
//        inputFile.close();
//
//        System.out.println("File input bernilai = " + inputFile);
//
//        inputFile = new FileInputStream("input2.txt");
//
//        System.out.println("File input2 bernilai = " + inputFile);

        // membuka file
        FileInputStream inputFile = null;
        FileOutputStream outputFile = null;

        inputFile = new FileInputStream("input.txt");

        // membaca file
        int data = inputFile.read();

        do {
            System.out.println((char)data);
            data = inputFile.read();
        } while(data != -1);

        // menutup file
        inputFile.close();

        // contoh skenario pembukaan file
        try {
            // membuka file
            inputFile = new FileInputStream("input2.txt");
            outputFile = new FileOutputStream("output2.txt");

            // membaca file
            int buffer = inputFile.read();

            // menulis file
            do {
                outputFile.write(buffer);
                buffer = inputFile.read();
            } while(buffer != -1);

        } finally {
            if(inputFile != null) {
                inputFile.close();
            }
            if(outputFile != null) {
                outputFile.close();
            }
        }

        // yang terakhir try(With Resource)
        try(
                FileInputStream in = new FileInputStream("input.txt");
                FileOutputStream out = new FileOutputStream("output.txt")
                ) {
            int data2 = in.read();
            do {
                out.write((char)data2);
                data2 = in.read();
            } while(data2 != -1);
        }
    }
}