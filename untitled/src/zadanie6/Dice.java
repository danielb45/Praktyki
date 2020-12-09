package zadanie6;

import java.security.SecureRandom;

public class Dice {
    private int n;
    SecureRandom random;

    public Dice(int n){
        this.n = n;
        random = new SecureRandom();
    }

    public int roll() {
        return this.random.nextInt(n) + 1;
    }
}
