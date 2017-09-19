// Nastassja Motro 9/18/17

import java.util.Random;

public class LotteryPrinter {
  public static void main(String[] args) {
    String rich;
    rich = "The following number combo will* make you rick \n";
    rich += String.format("%d, %d, %d, ", pickNumber(),pickNumber(),pickNumber());
    rich += String.format("%d, %d, %d \n", pickNumber(),pickNumber(),pickNumber());
    rich += "*Results not guaranteed";
    return rich;
  }
  
  public static int pickNumber() {
    Random lotteryNumber;
    lotteryNumber = new Random();
    int num = lotteryNumber.nextInt(48) + 1;
  return num;
  }
}
