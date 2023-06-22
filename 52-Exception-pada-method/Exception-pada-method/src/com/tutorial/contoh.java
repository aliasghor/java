package com.tutorial;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class contoh {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("input.txt");
        System.out.println((char)file.read());
    }
}
