// Nastassja Motro 11/27/17

import java.util.*;

public class Simulation {
  public static void main(String[] args) {
    // initialize variables
    Scanner integer = new Scanner(System.in);
    Scanner string = new Scanner(System.in);
    ArrayList<Card> hand = new ArrayList<Card>();
    Deck deck = new Deck();
    Card card;
    Rules handMark;
    Tester test = new Tester();
    int choice;
    String discardRank;
    String discardSuit;
    int discard = 0;
    String removeCard = "";
    int dollarsRemaining = 0;
    int dollars = 3;
    int timesPlayed = 0;
    final int costToPlay = 1;
    String again = "";
    
    // Set up for player
    System.out.println("Welcome to this wonderful game of Video Poker");
    System.out.println("I'm gonna be nice and let you start off with 3 dollars. How nice am I?");
    System.out.println("If your money ever goes to 0, then it's game over for ya buddy");
    System.out.println("To remove a card, ENTER IN A RANK AND A SUIT");
    System.out.println("Your ranks are: Ace, 2, 3, 4, 5, 6, 7, 8, 8, 10, Jack, Queen, King");
    System.out.println("Your suits are: hearts, diamonds, clubs, and spades");
    System.out.println("Also, when you want to remove a card, you can only remove a max of 5 cards");
    System.out.println("Good luck and have fun losing and gaining fake money");
    System.out.println();
    System.out.println();
    
    System.out.println("You have two options now, do you want to run the Simulation part of this game or just the Tester?");
    System.out.print("1 = Tester; 2 = Simulation]");
    choice = integer.nextInt();
    Systerm.out.println();
    
    if (choice == 1) {
      test.testObject();
    } else if (choice == 2) {
      do {
        hand - new ArrayList<Card>();
        deck = new Deck();
        card = new Card("", "");
        
        timesPlayed++;
        deck.createDeck();
        deck.shuffleDeck();
        hand = deck.dealHand();
        System.out.println("You have the following cards:");
        for (int i = 0; i < hand.size(); i++) {
          card = hand.get(i);
          System.out.println(card.getRank() + " " + card.getSuit());
        }
        System.out.println(" ");
        System.out.println("What would you like to do with your cards now?");
        System.out.println("Remove all cards = [1], remove some cards = [2], or remove none of your cards = [3]");
        choice = integer.nextInt();
        
        if (choice == 1) {
          hand = deck.dealHand();
          System.out.println("Your new hand: ");
          for (int i = 0; i < hand.size(); i++) {
            card = hand.get(i);
            System.out.println(card.getRank() + " " + card.getSuit());
          }
        } else if (choice == 2) {
          discard = 0;
          do {
            discard++;
            System.out.println("What card would you like to discard?");
            System.out.print("Enter the card's rank: ");
            discardRank = inputString.nextLine();
            System.out.print("Enter the card's suit: ");
            discardSuit = inputString.nextLine();
            System.out.println("");
            for (int i = 0; i < hand.size(); i++) {
              card = hand.get(i);
              if (card.getRank().equalsIgnoreCase(discardRank) && card.getSuit().equalsIgnoreCase(discardSuit)) {
                hand.remove(i);
                hand.add(deck.getCard());
                break;
              } else if ( i == 4) {
                System.out.println("That card can't be found");
                discard--;
              }
            }
            System.out.println("Your cards now are: ");
            for (int i = 0; i < hand.size(); i++) {
              card = hand.get(i);
              System.out.println(card.getRank() + " " + card.getSuuit());
            }
            System.out.println();
            System.out.print("Would you like to remove another card? [y = yes, n = no]");
            removeCard = inputString.nextLine();
          } while ((removeCard.equalsIgnoreCase("Yes") || removeCard.equalsIgnoreCase("y")) && discard != 5);
          
          if (discard == 5) {
            System.out.println();
            System.out.println("As said earlier, you can't change anymore than 5 cards");
            System.out.println("-----------------");
          }
        } else {
          System.out.println("No cards removed");
        }
        
        handMark = new Rules(hand);
        handMark.giveRules();
        System.out.println();
        System.out.println("The Type of Hand: " + handMark.getHandType());
        System.out.println("Dollars or amount won: " + handMark.getDollarsAmount() + " Dollars");
        dollars += handMark.getDollarsAmount();
        dollarsRemaining = dollars - (timesPlayed * costToPlay);
        System.out.println("Total profit, minus the cost of playing: " + dollarsRemaining + "dollars");
        
        System.out.print("Would you like to play again? Y/N");
        again = inputString.nextLine();
        System.out.println("----------------");
        System.out.println();
      } while ((again.equalsIgnoreCase("Yes") || again.equalsIgnoreCase"Y")) && dollarsRemaining > 0);
      
      if (dollarsRemaining == 0) {
        System.out.println("You're broke, so you can't keep playing, sorry");
        System.out.println("---------------");
      } else {
        System.out.println("you have now quit the game. Adios");
        System.out.prinlnt("Total profit, minus cost of playing: " + dollarsRemaining + " dollars");
      }
    } else {
      System.out.println("Unknown Number");
    }
    
    // close game
    integer.close();
    string.close();
  }
}
