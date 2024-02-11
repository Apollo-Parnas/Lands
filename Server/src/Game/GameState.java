package Game;

import java.util.ArrayList;

public class GameState {
    int rounds;
    ArrayList<Card> p1Deck;
    ArrayList<Card> p2Deck;

    ArrayList<Card> p1Hand;
    ArrayList<Card> p2Hand;

    ArrayList<Card> p1Discard;
    ArrayList<Card> p2Discard;

    public GameState() {
        this.p1Deck = new ArrayList<Card>();
        this.p2Deck = new ArrayList<Card>();
        initializeDeck(p1Deck);
        initializeDeck(p2Deck);

        this.p1Hand = new ArrayList<Card>();
        this.p2Hand = new ArrayList<Card>();

        this.p1Discard = new ArrayList<Card>();
        this.p2Discard = new ArrayList<Card>();
    }

    private void initializeDeck(ArrayList<Card> deck) {
        for (int i = 0; i < 5; i++) {
            deck.add(new Card(Card.Color.BLACK));
            deck.add(new Card(Card.Color.BLUE));
            deck.add(new Card(Card.Color.GREEN));
            deck.add(new Card(Card.Color.RED));
            deck.add(new Card(Card.Color.YELLOW));
        }
    }

    private void resolveCardEffect(Card card) {
        switch(card.color) {
            case BLACK:
                //codestuffhere
                break;
            case BLUE:
                //codestuffhere
                break;
            case GREEN:
                //codestuffhere
                break;
            case RED:
                //codestuffhere
                break;
            case YELLOW:
                //codestuffhere
                break;
        }
    }
}
