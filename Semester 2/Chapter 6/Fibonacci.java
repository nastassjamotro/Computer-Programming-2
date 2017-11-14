// Nastassja Motro 11/13/17

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    boolean cont = true;
    System.out.println("This program can tell you the Nth Fibonacci number.");
    while (cont = true) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter in an integer: ");
      int input = scan.nextInt();
      
      int fold1 = 0;
      int fold2 = 1;
      int foldNew = 0;
      int counter;
      
      for (counter = 0; counter < input; counter++) {
        foldNew = fold1 + fold2;
        fold2 = fold1;
        fold1 = foldNew;
      }
      
      System.out.println("The " + counter + "the Fibonacci is: " + foldNew);
      System.out.print("Would you like to try another number? Y/N: ");
      String reply = scan.next();
      if (reply.charAt(0) == 'Y' || reply.charAt(0) == 'y') {
        cont = true;
      } else {
        System.exit(0);
      }
    }
  }
}
