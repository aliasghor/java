package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // Tipe Data DI java
        // integer,byte,short,long,double,float,char,boolean
        // integer (Satuan)
        System.out.println("=======INTEGER=======");
        int x;
        x = 10;
        System.out.println("Nilai Int X: " + (x + 1));
        System.out.println("Nilai Max Integer = " + Integer.MAX_VALUE);
        System.out.println("Nilai Min Integer = " + Integer.MIN_VALUE);
        System.out.println("Besar Int = " + Integer.BYTES + " bytes");
        System.out.println("Besar Int = " + Integer.SIZE + " bit");

        System.out.println("=======Byte=======");
        byte b;
        b = 10;
        System.out.println("Nilai Byte X: " + b);
        System.out.println("Nilai Max Byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai Min Byte = " + Byte.MIN_VALUE);
        System.out.println("Besar Byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar Byte = " + Byte.SIZE + " bit");

        System.out.println("=======Short=======");
        short s;
        s = 10;
        System.out.println("Nilai Short X: " + s);
        System.out.println("Nilai Max Short = " + Short.MAX_VALUE);
        System.out.println("Nilai Min Short = " + Short.MIN_VALUE);
        System.out.println("Besar Short = " + Short.BYTES + " bytes");
        System.out.println("Besar Short = " + Short.SIZE + " bit");

        
        System.out.println("=======Long=======");
        long l;
        l = 10;
        System.out.println("Nilai Long X: " + l);
        System.out.println("Nilai Max Long = " + Long.MAX_VALUE);
        System.out.println("Nilai Min Long = " + Long.MIN_VALUE);
        System.out.println("Besar Long = " + Long.BYTES + " bytes");
        System.out.println("Besar Long = " + Long.SIZE + " bit");

        System.out.println("=======Double=======");
        double d;
        d = 11.9d;
        System.out.println("Nilai Double X: " + d + 1);
        System.out.println("Nilai Max Double = " + Double.MAX_VALUE);
        System.out.println("Nilai Min Double = " + Double.MIN_VALUE);
        System.out.println("Besar Double = " + Double.BYTES + " bytes");
        System.out.println("Besar Double = " + Double.SIZE + " bit");

        
        System.out.println("=======Float=======");
        float f;
        f = -10.5f;
        System.out.println("Nilai Float X: " + f);
        System.out.println("Nilai Max Float = " + Float.MAX_VALUE);
        System.out.println("Nilai Min Float = " + Float.MIN_VALUE);
        System.out.println("Besar Float = " + Float.BYTES + " bytes");
        System.out.println("Besar Float = " + Float.SIZE + " bit");

        System.out.println("=======Character=======");
        Character c = 'c';
        System.out.println("Nilai Character X: " + c);
        System.out.println("Nilai Max Character = " + Character.MAX_VALUE);
        System.out.println("Nilai Min Character = " + Character.MIN_VALUE);
        System.out.println("Besar Character = " + Character.BYTES + " bytes");
        System.out.println("Besar Character = " + Character.SIZE + " bit");

        
        System.out.println("=======Boolean=======");
        boolean val;
        val = true;
        System.out.println("Nilai Boolean X: " + val);
        System.out.println("Nilai Max Boolean = " + Boolean.TRUE);
        System.out.println("Nilai Min Boolean = " + Boolean.FALSE);
    }
}