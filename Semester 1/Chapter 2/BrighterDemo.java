// Nastassja Motro 9/18/17

import java.awt.Color;

public class BrigtherDemo {
  public static void main(String[] args) {
    Color myColor = new Color(50, 100, 150);
    Color brighterColor = myColor.brigther();
    System.out.println("Red - ");
    System.out.println(brighterColor.getRed());
    System.out.println("Green - ");
    System.out.println(brighterColor.getGreen());
    System.out.println("Blue - ");
    System.out.println(brighterColor.getBlue());
  }
}
