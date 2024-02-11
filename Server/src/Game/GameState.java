package Game;

import java.util.ArrayList;
import java.util.Random;

public class GameState {
    int rounds;
    ArrayList<Card> p1Deck;
    ArrayList<Card> p2Deck;

    ArrayList<Card> p1Hand;
    ArrayList<Card> p2Hand;

    ArrayList<Card> p1Discard;
    ArrayList<Card> p2Discard;

    ArrayList<Card> p1Board;
    ArrayList<Card> p2Board;

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
        Random rand = new Random();
        switch(card.color) {
            case BLACK:
                //p1Board.add(card)
                //p1Hand.remove(card)
                //player 2 chooses 3 cards to show to player one
                //player 1 see's the 3 cards and chooses one to discard
                //p2Discard.add(chosenCard)
                //p2Hand.remove(chosenCard)
                break;
            case BLUE:
                //codestuffhere
                break;
            case GREEN:
                //p1Board.add(card)
                //p1Hand.remove(card)
                //show player all the options in discard
                //player chooses card they want
                //drawnCard = chosenCard
                //p1Hand.add(drawnCard)
                //p1Discard.remove(drawnCard)
                break;
            case RED:
                //p1Board.add(card);
                //p1Hand.remove(card);
                //player 1 clicks a card from player 2's board
                //p2Discard.add(chosenCard);
                //p2Board.remove(chosenCard);
                break;
            case YELLOW:
                p1Board.add(card);
                p1Hand.remove(card);
                Card drawnCard = p1Deck.get(rand.nextInt(p1Deck.size()));
                p1Hand.add(drawnCard);
                p1Deck.remove(drawnCard);
                break;
        }
    }
    private boolean isWon() {
        int numBlacks = 0;
        int numBlues = 0;
        int numGreens = 0;
        int numReds = 0;
        int numYellows = 0;

        for (Card card : p1Board) {
            switch(card.color) {
                case BLACK:
                    numBlacks++;
                    break;

                case BLUE:
                    numBlues++;
                    break;

                case GREEN:
                    numGreens++;
                    break;

                case RED:
                    numReds++;
                    break;

                case YELLOW:
                    numYellows++;
                    break;

            }
        }
        return ((numBlacks == 5 || numBlues == 5 || numGreens == 5 || numReds == 5 || numYellows == 5) || (numBlacks > 0 && numBlues > 0 && numGreens > 0 && numReds > 0 && numYellows > 0));
    }

}
