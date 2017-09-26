// Nastassja Motro

/* P2.3: The intersection method compute the _intersection_ of two rectangles - that is, the rectangle that would be formed by
two overlapping rectangles if they were drawn. You call this method as follows:
  Rectangle r3 = r1.intersection(r2);
Write a program IntersectionPrinter that constructs two rectangle objects, prints them as described in Exercise P2.1, and then prints
the rectangle object that describes the intersection. Then the program should print the result of the intesection method when the 
rectangles do not overlap. Add a comment to your program that explains how you can tell whether the resulting rectangle is empty. */

import java.awt.Rectangle;

public class IntersectionPrinter {
  public static void main(String[] args) {
    Rectangle a = new Rectangle(0, 0, 10, 10);
    Rectangle b = new Rectangle(5, 5, 10, 10);
    Rectangle c = a.intersection(b);
    System.out.println(a);
    System.out.print(" intersected with ");
    System.out.print(b);
    System.out.print(" produces ");
    System.out.print(c);
    System.out.println(" ");
    a.translate(10, 10);
    b.translate(50, 50);
    Rectangle d = a.intersection(b);
    System.out.prinlnt(a);
    System.out.print(" intersected with ");
    System.out.print(b);
    System.out.print(" produces ");
    System.out.print(d);
  }
}
