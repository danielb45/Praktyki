package cards;

public class Card {

    private String color;
    private int value;
    String symbol;

    public Card(String color, int value, String symbol) {
        this.color = color;
        this.value = value;
        this.symbol = symbol;
    }

    public String getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public String toString() {
        return this.symbol + " " + this.color;
    }
}