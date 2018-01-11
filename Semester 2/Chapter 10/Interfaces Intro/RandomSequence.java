// Nastassja Motro 01/10/18

public class RandomSequence implements Sequence {
  public int next() {
    return (int) (Integer.MAX_VALUE * Math.random());
  }
}
