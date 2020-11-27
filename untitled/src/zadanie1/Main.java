package zadanie1;

public class Main {
    public static void main (String[] args){

        int[] tablica = {1,2,3,4,5,6,7,8,9,10};
        int suma = 0;

        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        System.out.println("Suma: " + suma);
    }
}
