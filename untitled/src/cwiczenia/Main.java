package cwiczenia;

public class Main {
    public static void main (String[] args) {

        //zadanie: posortuj tablice liczb calkowitych rosnaco
        int[] tab = {4,2,5,76,8,2,14,234,346,32,1};
        int[] wynik = new int[tab.length];

        //przechodzimy po kazdym elemencie tablicy wynikow
        for (int j=0; j<wynik.length; j++) {
            //petla przechodzaca po wszystkich elementach tablicy
            int temp = tab[0];
            int lokalizacja = 0;
            for (int i = 0; i < tab.length; i++){
                //porownaj przechowywana zmienna z kolejnym miejscem w tablicy
                if (temp > tab[i]) {
                    temp = tab[i];
                    lokalizacja = i;
                }
            }
                //Wpisujemy do konkretnego miejsca w tablicy nasza wartosc oraz ustawiamy go na Null
                wynik[j] = temp;
                tab[lokalizacja] = Integer.MAX_VALUE;

                //Wypisujemy tablice wynikow
                System.out.println(wynik[j] + ", ");
            }
        }
}
