// Nastassja Motro 09/24/17

/* P2.10: Write a graphics program that draws 12 strings, one each for the 12 standard colors (except Color.WHITE), each in its own
color. Porivde a class ColorNameViewer and a class ColorNameComponent. */

import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;

public class ColorNameViewer{
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    
    frame.setSize(400, 400);
    frame.setTitle("Color Name Viewer");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ColorNameComponent component = new ColorNameComponent();
    frame.add(component);
    
    frame.setVisible(true);
  }

public static class ColorNameComponent extends JComponent {
  public void paintComponent(Graphics g) {
    Color [] colors = {
      Color.BLACK,
      Color.BLUE,
      Color.CYAN,
      Color.DARK_GRAY,
      Color.GRAY,
      Color.GREEN,
      Color.LIGHT_GRAY,
      Color.MAGENTA,
      Color.ORANGE,
      Color.PINK,
      Color.RED,
      Color.YELLOW,
    };
    
    Graphics2D g2 = (Graphics2D) g;
    
    for(int i=0; i<colors.length; i++) {
      g2.setColors(colors[i]);
      g2.draw(newLine2D.Double(i, 50, i, 100));
    }
  }
 }
}
