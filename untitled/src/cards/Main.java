package cards;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();

//        for (Card c : deck.deck) {
//            System.out.println(c);
//        }


        System.out.println(deck.deck.size());
        Card card = deck.draw();
        System.out.println(deck.deck.size());
        System.out.println(card);
    }
}
