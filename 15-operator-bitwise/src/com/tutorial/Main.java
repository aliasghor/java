package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // Operator bitwise
        byte a = 3;
        byte b,c;
        String a_bits,b_bits,c_bits;

        // operator shift left
        System.out.println("===== SHIFT LEFT (<<)");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d\n",a_bits,a);
        b = (byte)(a << 3);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d\n",b_bits,b);

        // operator shift right
        System.out.println("===== SHIFT Right (>>)");
        a = 24;
        b = (byte)(a >> 2);
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d\n",a_bits,a);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d\n",b_bits,b);

        // operator bitwise or
        System.out.println("===== BITWISE OR (|)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits, b);
        c = (byte)(a | b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits, c);

        // operator bitwise and
        System.out.println("===== BITWISE and (&)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits, b);
        c = (byte)(a & b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits, c);

        // Operator bitwise XOR
        System.out.println("===== BITWISE XOR (^)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("--------------------XOR");
        c = (byte)(a ^ b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits, c);

        // Operator Negasi / Not
        System.out.println("===== BITWISE NOT (~)");
        a = 24;
        b = (byte) (~a);
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        System.out.println("--------------------NOT");
        b_bits = String.format("%8s",Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d \n",b_bits, b);


    }
}