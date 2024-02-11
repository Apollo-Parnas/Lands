package Game;

public class Card
{
    enum Color {
        BLACK, BLUE, GREEN, RED, YELLOW
    }

    Color color;

    public Card(Color color) {
        this.color = color;
    }
}
