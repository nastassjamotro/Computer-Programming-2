// Nastassja Motro 01/10/18

public class LastDigitDistribution {
  public void process (Sequence seq, int ValuesToProcess) {
  
    for (int i = 1; i <= valuesToProcess; i++) {
      int value = seq.next();
      int lastDigit = value % 10;
      counters[lastDigit]++;
    }
    
  }
}
