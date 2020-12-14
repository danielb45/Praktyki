package zadanie7;

public class Main {
    public static void main(String[] args){
        int[]tab = {1, 732, 5, 43, 9, 21}; //tablica intow "tab"
        int n;
        n = tab[0];

        for(int i = 0; i < tab.length; i++){ //petla dla i=0, i wieksze od dlugosci tablicy i i++
            if(n < tab[i]){ //jezeli n jest mniejsze od nastepnej liczby w tablicy
                n = tab[i]; //n zamienia sie
            }
        }
        System.out.println(n); //wypisuje najwieksza liczbe
    }
}
