package cwiczenie4;

import java.util.Scanner;

public class zad {
    public static double funkcja(double a, double b, double x){
        double fliniowa = a*x+b;
        return fliniowa;
    }
    public static void mz(double a, double b){
        mz = -(b/a);
        System.out.println(mz);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a, b, x: ");

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double x = scanner.nextInt();
    }
}
