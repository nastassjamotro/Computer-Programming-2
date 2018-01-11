// Nastassja Motro 01/10/18

public class SequenceDemo {
  public static void main(String[] args) {
  
    LastDigitDistribution d1 = new LastDigitDistribution();
    d1.process(new SquareSequence(), 1000);
    d1.display();
    System.out.println();
    
    LastDigitDistribution d2 = new LastDigitDistribution();
    d2.process(new RandomSequence(), 1000);
    d2.display();
  }
}
