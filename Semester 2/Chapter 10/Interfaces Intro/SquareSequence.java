// Nastassja Motro 01/10/18

public class SquareSequence implements Sequence {
  private int n;
  
  public int next() {
    n++;
    return n * n;
  }
  
}
