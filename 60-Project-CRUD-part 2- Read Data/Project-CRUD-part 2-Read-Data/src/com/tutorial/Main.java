package com.tutorial;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    private static void tampilkanData() throws IOException {
        FileReader fileInput;
        BufferedReader bufferedInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferedInput = new BufferedReader(fileInput);
        } catch(Exception e) {
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan buat datanya terlebih dahulu");
            return;
        }

        String data = bufferedInput.readLine();
        int nomorData = 0;
        System.out.println("\n|No |\tTahun  |\tPenulis             |\tPenerbit            |\tJudul Buku");
        System.out.println("--------------------------------------------------------------------------------");
        while(data != null) {
            nomorData++;

            StringTokenizer stringToken = new StringTokenizer(data,",");

            stringToken.nextToken();
            System.out.printf("| %2d",nomorData);
            System.out.printf("|\t%4s ",stringToken.nextToken());
            System.out.printf("  |\t%-20s",stringToken.nextToken());
            System.out.printf("|\t%-20s",stringToken.nextToken());
            System.out.printf("|\t%s",stringToken.nextToken());
            System.out.print("\n");

            data = bufferedInput.readLine();
        }
        System.out.println("--------------------------------------------------------------------------------");
    }
    private static boolean getYesOrNo(String messsage) {
        Scanner userOption = new Scanner(System.in);
        System.out.print("\n" + messsage + " (y/n)? ");
        String userChoice = userOption.next();
        while(!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y ato n");
            System.out.print("\n" + messsage + " (y/n)? ");
            userChoice = userOption.next();
        }
        return userChoice.equalsIgnoreCase("y");
    }
    private static void clearScreen() {
        try {
            if(System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch(Exception e) {
            System.err.println("Tidak bisa clear screen");
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner userOption = new Scanner(System.in);
        String userChoice;
        boolean lanjutkan = true;

        while(lanjutkan) {
            clearScreen();
            System.out.println("Database perpustakaan\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.print("Masukan pilihan anda: ");
            userChoice = userOption.next();

            switch(userChoice) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("Melihat isi buku");
                    System.out.println("=================");
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("=========");
                    System.out.println("Cari buku");
                    System.out.println("=========");
                    break;
                case "3":
                    System.out.println("\n=========");
                    System.out.println("Tambah Buku");
                    System.out.println("===========");
                    break;
                case "4":
                    System.out.println("\n===========");
                    System.out.println("Ubah buku");
                    System.out.println("=============");
                    break;
                case "5":
                    System.out.println("\n========");
                    System.out.println("Hapus buku");
                    System.out.println("==========");
                    break;
                default:
                    System.err.println("\nInput yg anda masukan salah!!!\nSilahkan pilih (1-5)");
            }
            lanjutkan = getYesOrNo("Apakah anda ingin melanjutkan? ");
        }
    }
}