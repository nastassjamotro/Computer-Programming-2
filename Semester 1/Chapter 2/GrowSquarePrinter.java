// Nastassja Motro

/* P2.2: Write a GrowSquarePrinter program that constructs a Rectangle object square representing a square with top-left corner (100,100)
and side length 50, prints its location by calling System.out.println(square), applies the translate and grow methods, and calls 
System.out.println(square) again. The calls to translate and grow should modify the square so that it has twice the size and the same
top-left corner as the original. Your program will not produce a drawing. It will simply print the location of square before and after
calling the mutator methods. Look up the description of the grow method in the API documentation. */

import java.awt.Rectangle;

public class GrowSquarePrinter {
  public static void main(String[] args) {
    Rectangle square = new Rectangle(100, 100, 50, 50);
    System.out.println(square);
    square.grow(25, 25);
    square.translate(25, 25);
    System.out.println(square);
  }
}
