package com.tutorial;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        // Format string
        String nama = "Ali";
        int umur = 20;
        String hape = "oppo";
        int batre = 100;

        // nge print dengan cara biasa
        System.out.println("Nama saya: " + nama + " dan umur saya adalah: " + umur);

        // nge print menggunakan printf
        System.out.printf("Nama saya adalah: %s umur saya adalah: %d\n",nama,umur);
        System.out.printf("Hape saya adalah %s dan sisa batre saya adalah %d%%\n",hape,batre);
        // System.out.printf("Nama ane %s dan umur ane %d untuk saat ini suatu saat umur saya akan bertambah lagi setelah membikin program ini\n",nama,umur);

        // confersion f = floating point, c = char(character), d = integer(int), s = string(String), b = boolean(boolean)

        // [argumen_index$]
        System.out.println("[argumen_index$]\n");
        System.out.printf("Umur %1$s berapa tahun? %1$s menjawab umur dia %2$d\n",nama,umur);
        System.out.printf("Hape kamu mereknya apa? mereknya %1$s sisa batrenya brp? sisa batre = %2$d\n\n",hape,batre);

        // [flags]
        System.out.println("[flags]\n");
        int angka1 = 5;
        int angka2 = 8;
        int hasil = angka1 - angka2;
        System.out.printf("%d + %d = %+d\n",angka1,angka2,hasil);

        // [width]
        System.out.println("[width]\n");
        int angka3 = 1000;
        System.out.println("integer");
        System.out.printf("%d\n",angka3);
        System.out.printf("%-5d\n",angka3);
        System.out.printf("%+5d\n",angka3);
        System.out.printf("%+-6d\n",angka3);
        System.out.printf("%10d\n",angka3);
        System.out.printf("%010d\n",angka3);

        int angka4 = 10000;
        System.out.printf("%-,1d",angka4);

        System.out.println("Floating point");

        float angka5 = 1.5f;
        System.out.printf("%f\n",angka5);
        System.out.printf("%+9f\n",angka5);

        // precision
        System.out.println("[precision]");

        float angka6 = 15.678f;
        System.out.printf("%f\n",angka6);
        System.out.printf("%.1f\n",angka6);
        System.out.printf("%.2f\n",angka6);
        System.out.printf("%8.2f\n",angka6);
        System.out.printf("%+08.2f\n",angka6);

        // Contoh
        String nama2 = "Gerry";
        float ipk = 3.785152512f;
        System.out.printf("%1$s mendapatkan ipk %2$+5.2f\n",nama2,ipk);

        // kesimpulan
        // save format ini ke dalam varibael string
        String info = String.format("nama: %s mendapatkan ipk: %2$+5.2f",nama2,ipk);
        System.out.println("String format = " + info);

        // save format ini ke dalam string builder
        StringBuilder builder = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder);

        formatBuilder.format("nama: %s ipk: %2$+5.2f",nama2,ipk);
        System.out.println("String builder format = " + builder);
    }
}