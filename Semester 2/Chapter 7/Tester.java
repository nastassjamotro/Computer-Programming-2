// Nastassja Motro 11/27/17

import java.util.*;

public class Tester {
  ArrayList<Card> hand = new ArrayList<Card>();
  ArrayList<Card> cardDeck = new ArrayList<Card>();
  Card card;
  Rules testRules;
  Deck testDeck;
  
  // ranks
  String queen = "Queen";
  String king = "King";
  String jack = "Jack";
  String ace = "Ace";
  
  // suits
  String hearts = "Hearts";
  String diamonds = "Diamonds";
  String clubs = "Clubs";
  String spades = "Spades";
  
  // possible ranks - because I hate mself
  String[] rank = {ace, "10", jack, queen, king,
                   "2", "3", "4", "5", "6",
                   "6", "7", "8", "9", "10",
                   "9", "9", "9", "9", "5",
                   queen, quen, queen, "4", "4",
                   "2", "4", "6", "8", "9",
                   "4", "5", "6", "7", "8",
                   "4", "4", "4", "7", "8",
                   "2", "2", king, king, jack,
                   queen, queen, "5", "7", "9",
                   jack, "3", queen, "5", king, "7"};
  
  // possible suits - becuase I still hate myself
  String[] suit = {hearts, hearts, hearts, hearts, hearts,
                    diamonds, diamonds, diamonds, diamonds, diamonds,
                    clubs, clubs, clubs, clubs, clubs,
                    spades, spades, spades, spades, spades,
                    hearts, clubs, diamonds, spades, hearts,
                    hearts, diamonds, clubs, hearts, diamonds,
                    hearts, diamonds, spades, clubs, clubs,
                    spades, hearts, slubs, diamonds, clubs,
                    diamonds, hearts, diamonds, hearts, hearts,
                    hearts, diamonds, diamonds, clubs, spades,
                    hearts, clubs diamonds, clubs, spades};
  
 public Tester {
   
 }
  
  // tests hands
  public void testObject() {
    testDeck = new Deck(rank, suit);
    testDeck.createDeckTester();
    
    // royal flush
    hand = testDeck.dealHand();
    printHand();
    getValues();
    System.out.println("Expected:");
    System.out.println("Hand type: Royal Flush");
    System.out.println("Money won: 250 dollars");
    
    // straight flush
    hand = testDeck.dealHand();
    printHand();
    getValues();
    System.out.println("Expected:");
    System.out.println("Hand type: Straight Flush");
    System.out.println("Money won: 50 dollars");
    
    // four of kind
    hand = testDeck.dealHand();
    printHand();
    getValues();
    System.out.println("Exptected:");
    System.out.println("Hand type: Four of a Kind");
    System.out.prinlnt("Money won: 25 dollars");
    
    // full house
    hand = testDeck.dealHand();
    printHand();
    getValues();
    System.out.println("Expected:");
    System.out.println("Hand type: Full House");
    System.out.println("Money won: 6 dollars");
    
    // flush
    hand = testDeck.dealHand();
    printHand();
    getValues();
    System.out.println("Expected:");
    System.out.println("Hand type: Flush");
    System.out.println("Money won: 5 dollars");
   
    // straight
    hand = testDeck.dealHand();
    printHand();
    getValues();
    System.out.println("Expected:");
    System.out.println("Hand type: Straight");
    System.out.println("Money won: 4 dollars");
    
    // three
    hand = testDeck.dealhand();
    printHand();
    getValues();
    System.out.println("Expected:");
    System.out.println("Hand type: Three of a Kind");
    System.out.println("Money won: 3 dollars");
    
    // two
    hand = testDeck.dealHand();
    printHand();
    getValues();
    System.out.println("Expected:");
    System.out.println("Hand type: Two Pairs");
    System.out.println("Money won: 2 dollars");
    
    // one
    hand = testDeck.dealHand();
    printHand();
    getValues();
    System.out.println("Expected:");
    System.out.println("Hand type: One Pair");
    System.out.println("Money won: 1 dollar");
    
    // none
    hand = testDeck.dealHand();
    printHand();
    getValues();
    System.out.println("Expected:");
    System.out.println("Hand type: No Pairs");
    System.out.println("Money won: 0 dollars");
    
    // un-shuffled deck
    testDeck = new Deck();
    testDeck.createDeck();
    cardDeck = testDeck.printDeck();
    System.out.println();
    System.out.println("----------");
    System.out.println();
    System.out.println("Deck of unshuffled cards:");
    System.out.println();
    for (int i = 0; i < cardDeck.size(); i++) {
      System.out.println(cardDeck.get(i).getRank() + " " + cardDeck.get(i).getSuit());
    }
    
    // shuffled deck
    testDeck.shuffleDeck();
    System.out.println();
    System.out.println("------------");
    System.out.println();
    System.out.println("Deck of shuffled cards:");
    System.out.println();
    for (int i = 0; i < cardDeck.size(); i++) {
      System.out.println(cardDeck.get(i).getRank() + " " + cardDeck.get(i).getSuit());
    }                      d
