package gerry.util;
public class Pace {
    public static void printPublic() {
        System.out.println("Pace print public");
    }
    private static void printPrivate() {
        System.out.println("Pace print private");
    }
    static void printDefault() {
        System.out.println("Pace print default");
    }
    protected static void printProtected() {
        System.out.println("Pace print protected");
    }
}
