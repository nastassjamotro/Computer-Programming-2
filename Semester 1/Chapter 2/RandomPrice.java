// Nastassja Motro 9/18/17

import java.util.Random;

public class RandomPrice {
  public static void main(String[] args) {
    Random rand = new Random();
    double n = rand.nextInt((19.95) + 10.00);
    System.out.println(n);
  }
}
