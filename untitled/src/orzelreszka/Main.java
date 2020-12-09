package orzelreszka;

import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        rzut();
    }
    public static void rzut(){
        SecureRandom random = new SecureRandom();
        int i = random.nextInt(2);
        i++;
        if(i==1){
            System.out.println("Orzel");
        }
        else if(i==2){
            System.out.println("Reszka");
        }
    }
}
