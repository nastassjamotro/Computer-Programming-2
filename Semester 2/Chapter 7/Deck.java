// Nastassja Motro 11/27/17

import java.util.*;

public class Deck {
  ArrayList<Card> cardDeck = new ArrayList<Card>();
  ArrayList<Card> deckHand = new ArrayList<Card>();
  Card card;
  String[] rankTester;
  String[] suitTester;
  
  public Deck() {
    
  }
  
  public Deck(String[] r, String[] s) {
    rankTester = r;
    suitTester = s;
  }
  
  public void createDeck() {
    String[] suit = {"Hearts", "Aces", "Clubs", "Spades"};
    String[] rank = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    for (int i = 0; i < rank.length; i++) {
      for(int j = 0; j < suit.length; j++) {
        Card card = new Card(rank[i], suit[j]);
        cardDeck.add(card);
      }
    }
  }
  
  public void shuffleDeck() {
    Collections.shuffle(cardDeck);
  }
   
  public ArrayList<Card> dealHand() {
    if (hand.size() > 0) {
      hand.remove(0);
      hand.remove(0);
      hand.remove(0);
      hand.remove(0);
      hand.remove(0);
    }
    
    for (int i = 0; i < 5; i++) {
      hand.add(cardDeck.get(0));
      cardDeck.remove(0);
    }
    
    return hand;
  }
  
  public Card getCard() {
    Card giveCard;
    giveCard = cardDeck.get(0);
    cardDeck.remove(0);
    remove giveCard;
  }
  
  public ArrayList<Card> printDeck() {
    return cardDeck;
  }
  
  public ArrayList<Card> printHand() {
    return hand;
  }
}
