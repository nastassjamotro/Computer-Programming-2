// Nastassja Motro 10/24/17

import java.util.Scanner;

public class TriangleTester {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter x coordinate for the first point of the triangle: ");
    x1 = scan.nextInt();
    System.out.println("Enter y coordinate for the first point of the triangle: ");
    y1 = scan.nextInt();
    System.out.println("Enter x coordinate for the second point of the triangle: ");
    x2 = scan.nextInt();
    System.out.println("Enter y coordinate for the second point of the triangle: ");
    y2 = scan.nextInt();
    System.out.println("Enter x coordinate for the third point of the trianlge: ");
    x3 = scan.nextInt();
    System.out.println("Enter y coordinate for the third point of the triangle: ");
    y3 = scan.nextInt();
    
    System.out.println("Side length from point 2 to point 3 is: "  + getSideA());
    System.out.println("Side length from point 1 to point 3 is: " + getSideB());
    System.out.println("Side length from point 1 to point 2 is: " + getSideC());
    System.out.println("First angle measurement is: " + getAngleA());
    System.out.println("Second angle measurement is: " + getAngleB());
    System.out.println("Third angle measurement is: " + getAngleC());
    System.out.println("Perimeter of the triangle is: " + getPerimeter());
    System.out.println("Area of the triangle is: " + getArea());
  }
}
