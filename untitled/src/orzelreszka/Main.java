package orzelreszka;

import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        rzut();
    }
    public static void rzut(){ //funkcja rzut
        SecureRandom random = new SecureRandom(); //losowanie liczby
        int i = random.nextInt(2); // random.nextInt zwraca pseudolosowa liczbe
        if(i==1){ //jezeli i=1 to
            System.out.println("Orzel"); //wyrzucenie "Orzel"
        }
        else if(i==2){ //jezeli i=2
            System.out.println("Reszka"); //wyrzucenie "reszka"
        }
    }
}
