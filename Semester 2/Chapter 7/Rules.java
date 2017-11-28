// Nastassja Motro 11/27/17

import java.util.*;

public class Rules {
  Card card;
  ArrayList<Card> hand = new ArrayList<Card>();
  ArrayList<Integer> handRank = new ArrayList<Integer>();
  ArrayList<String> handSuit = new ArrayList<String>();
  int[] rank = new int[14];
  int dollars = 0;
  String handType = "";
  boolean flush = true;
  int smallGroup = 0;
  int largGroup = 0;
  boolean straight = false;
  int topStraightValue = 0;
  boolean royalFlush = false;
  
  public Rules(ArrayList<Card> h) {
    hand = h;
  }
  
  // Need to have program determine what type of hand it is
  public void giveRules() {
    for (int i = 0; i < hand.size(); i++) {
      if (hand.get(i).getRank().equals("Ace")) {
        handRank.add(1);
      } else if (hand.get(i).getRank().equals("Jack")) {
        handRank.add(11);
      } else if (hand.get(i).getRank().equals("Queen")) {
        handRank.add(12);
      } else if (hand.get(i).getRank().equals("King")) {
        handRank.add(13);
      } else {
        handRank.add(Integer.parseInt(hand.get(i).getRanks()));
      }
    }
    
    // this organizes the handRank
    Collections.sort(handRank);
    
    for (int i = 0; i < hand.size(); i++) {
      handSuit.add(hand.get(i).getSuit());
    }
    
    // yay, now we can finally check all the different suits
    
    // flush
    for (int i = 0; i < handSuit.size() - 1; i++) {
      if (!handSuit.get(i).equals(handSuit.get(i+1))) {
        flush = false;
      }
    }
    
    // 2 or 3 or 4 of a kind
    for (int i = 0; i <= 13; i++) {
      rank[i] = 0;
    }
    
    for (int j = 0; j < handRank.size(); j++) {
      rank[handRank.get(j)]++;
    }
    
    int same = 1;
    int same2 = 1;
    
    for (int j = 13; j >= 1; x--) {
      if (rank[j] > same) {
        if (same != 1) {
          same2 = same;
          smallGroup = largeGroup;
        }
        
        same = rank[j];
        largeGroup = j;
      } else if (rank[j] > same2) {
        same2 = rank[j];
        smallGroup = j;
      }
    }
    
    int sameJack = 1;
    int sameJack2 = 1;
    
    for (int x = 13; x >= 11; x--) {
      if (rank[j] > sameJack) {
        if (sameJack != 1) {
          sameJack2 = sameJack;
          smallGroup = largeGroup;
        }
        sameJack = rank[j];
        largeGroup = j;
      } else if (rank[j] > sameJack2) {
        sameJack2 = rank[j];
        smallGroup = j;
      }
    }
    
    // straight
    for (int i = 1; i <= 9; i++) {
      if (rank[i] == 1 && rank[i + 1] == 1 && rank[i + 2] == 1 && rank[i + 3] == 1 && rank[i + 4] == 1) {
        straight = true;
        topStraight = i + 4;
        break;
      }
    }
    
    if (rank[10] == 1 && rank[11] == 1 && rank[12] == 1 && rank[13] == 1 && rank1] == 1) {
      straight = true;
      royalFlush = true;
    }
    
    if (flush) {
      if (royalFlush) {
        dollars = 250;
        handType = "Royal Flush";
      } else if (straight) {
        dollars = 50;
        handType = "Straight Flush";
      } else {
        dollars = 5;
        handType = "Flush";
      }
    } else if (same == 4) {
      dollars = 25;
      handType = "Four of a Kind";
    } else if (same == 3 && same2 == 2) {
      dollars = 6;
      handType = "Full House";
    } else if (straight) {
      dollars = 4;
      handType = "Straight";
    } else if (same == 3 && same2 != 2) {
      dollars = 3;
      handType = "Three of a Kind";
    } else if (same == 2 && same2 == 2) {
      dollars = 2;
      handType = "Two Pairs";
    } else if (sameJack == 2 && sameJack2 == 1) {
      dollars = 1;
      handType = "One Pair";
    } else {
      dollars = 0;
      handType = "No Pair";
    }
  }
  
  public int getMoneyAmount() {
    return dollars;
  }
  
  public String getHandType() {
    return handType;
  }
}
