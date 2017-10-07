// Nastassja Motro

public class UnitTestCounter {
  public static void main(String[] args) {
    Counter tally = new Counter();
    tally.click();
    tally.click();
    int result = tally.getValue();
    System.out.println("result: " + result);
    tally.reset();
  }
}
