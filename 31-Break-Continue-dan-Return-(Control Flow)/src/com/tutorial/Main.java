package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // break continoue dan return
        int a = 0;

        do {
            a++;
            if(a == 10) {
                break;
            } else if(a == 5) {
                continue;
            } else if(a == 7) {
                return;
            }
            System.out.println("Looping ke = " + a);
        } while(true);
    }
}