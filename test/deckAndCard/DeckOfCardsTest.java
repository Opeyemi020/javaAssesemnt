package deckAndCard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckOfCardsTest {

    @Test
    void testThatCardCanShuffle(){
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        for (int i = 1; i <= 52 ; i++) {
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if (i % 4 == 0){
                System.out.println();
                

                String expected = "Ace of Diamonds    Seven of Diamonds  Jack of Hearts     Jack of Clubs      \n" +
                        "Ace of Spades      Jack of Spades     Deuce of Diamonds  Eight of Clubs     \n" +
                        "Four of Hearts     Ten of Spades      Six of Diamonds    Ten of Diamonds    \n" +
                        "Four of Diamonds   Nine of Diamonds   Deuce of Clubs     Deuce of Spades    \n" +
                        "Six of Spades      Five of Clubs      Five of Hearts     Five of Spades     \n" +
                        "Three of Spades    King of Spades     Six of Hearts      Seven of Clubs     \n" +
                        "Five of Diamonds   King of Clubs      Six of Clubs       Seven of Hearts    \n" +
                        "Queen of Clubs     Four of Spades     Four of Clubs      Nine of Hearts     \n" +
                        "King of Diamonds   Queen of Spades    Ace of Hearts      Jack of Diamonds   \n" +
                        "Three of Hearts    Three of Diamonds  Eight of Spades    Ace of Clubs       \n" +
                        "Ten of Clubs       Ten of Hearts      Deuce of Hearts    Queen of Diamonds  \n" +
                        "Nine of Spades     Eight of Diamonds  Eight of Hearts    Three of Clubs     \n" +
                        "Nine of Clubs      Queen of Hearts    Seven of Spades    King of Hearts  ";
            }

        }
    }

}