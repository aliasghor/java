package com.tutorial;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        // String Builder
        StringBuilder builder = new StringBuilder("Gerry");
        print(builder);

        // append
        builder.append(" Ganteng");
        print(builder);

        builder.append(" Abiezz gillee");
        print(builder);

        // insert
        builder.insert(5," Mogi");
        print(builder);

        // delete
        builder.delete(5,10);
        print(builder);

        // rubah character pada index tertentu
        builder.setCharAt(6,'g');
        print(builder);

        // replace
        builder.replace(14,20,"Abis");
        print(builder);

        // Casting menjadi string
        String kalimatBuilder = builder.toString();
        System.out.println(kalimatBuilder);
        int addres = System.identityHashCode(kalimatBuilder);
        System.out.println("Addres = " + Integer.toHexString(addres));
    }
    private static void print(StringBuilder builder) {
        System.out.println("Data = " + builder);
        System.out.println("Panjang = " + builder.length());
        System.out.println("Kapasitas = " + builder.capacity());

        int addres = System.identityHashCode(builder);
        System.out.println(Integer.toHexString(addres));
    }
}