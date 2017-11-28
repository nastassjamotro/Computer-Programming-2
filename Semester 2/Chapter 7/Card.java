// Nastassja Motro 11/27/17

public class Card {
  String cardSuit;
  String cardRank;
  
  public Card(String suit, String rank) {
    cardSuit = suit;
    cardRank = rank;
  }
  
  public String getSuit() {
    return cardSuit;
  }
  
  public String getRank() {
    return cardRank;
  }
}
