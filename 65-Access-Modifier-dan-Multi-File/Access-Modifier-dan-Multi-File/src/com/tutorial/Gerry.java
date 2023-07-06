package com.tutorial;

public class Gerry {
    // Bagian ini dapet diakses oleh siapapun
    public static void methodPublic() {
        System.out.println("Gerry public");
        methodPivate();
    }
    // ini hanya dapat diakses oleh class yang bersangkutan
    private static void methodPivate() {
        System.out.println("Gerry private");
    }
    // ini hanya dapet diakses oleh class dalam package yang sama
    static void methodDefault() {
        System.out.println("Gerry method default");
    }
    /*
    ini hanya dapat diakses oleh class dalam package yang sama
    dan subclassnya
     */
    protected static void methodProtected() {
        System.out.println("Gerry method protected");
    }
}
