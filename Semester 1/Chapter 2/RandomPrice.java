// Nastassja Motro 9/18/17

import java.util.Random;

public class RandomPrice {
  public static void main(String[] args) {
    Random rand = new Random();
    System.out.println(rand.nextFloat(19.95) + 10.00);
  }
}
