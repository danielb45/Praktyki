public class Main {
    public static void main(String[] args) {
        int zmienna = 30;
        float zmiennaf = 1.0f;
        double zmiennad= 2.0;
        long zmiennal = 20;
        boolean zmiennab = true;
        char zmiennac = 'K';
        String zmiennas = "Hello";
        zmiennas.charAt(2);
        String komunikat = new String ("Hello World");

        char[] tablicaChar = new char[5];
        tablicaChar[0] = 'H';
        tablicaChar[1] = 'e';
        tablicaChar[2] = 'l';
        tablicaChar[3] = 'l';
        tablicaChar[4] = 'o';

        int[] tablicaInt = {6, 344, 123, 73, 234, 876};

        for(int i = 0; i < 30; i++) {
            if (0 < zmiennai) {
                zmiennai = -1;
            } else {
                zmiennai = 30;
            }
            System.out.println(zmiennai);
        }

        for (int i = 0; i < tablicaChar.length; i++);{
            System.out.print(tablicaChar[i]);
        }

        int iteration = 0;
        while(iteration < 15){
            System.out.print(komunikat);
            iteration += iteration + 1;
        }


        boolean stopLoop = true;
        do{
            stopLoop = false;
            System.out.println("WYkonanie pętli");

        }while(stopLoop);

        int x = 40;
        x = x % 3

        //zadanie - modulo 2 = 0;

        //zadanie
        int i=0;
        for(int i=0; i<=10; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        //zadanie drugie rozwiazanie

        int liczba = 0;
        while(liczba<=0){
            if (liczba%2 ==0){
                System.out.println(liczba);
            }
        }

        //Tu wypisuje jaki jest znak ASCII dla litery f
            System.out.println((int)'f');

        //zadanie2 zsumuj liczby w tablicy

        int[] tablica = {1,2,3,4,5,6,7,8,9,10}
        int suma = 0;
        for (int i = 0; i < tablica.length; i++){
            suma+=tablica[i];
        }
    }
}
