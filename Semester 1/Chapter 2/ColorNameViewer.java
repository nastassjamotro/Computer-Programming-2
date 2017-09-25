// Nastassja Motro 09/24/17

import javax.swing.JFrame;

public class ColorNameViewer{
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    
    frame.setSize(400, 400);
    frame.setTitle("ColorNameViewer");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ColorNameComponent component = new ColorNameComponent();
    frame.add(component);
    
    frame.setVisible(true);
  }
}

import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Line2D;
import java.awt.geom.LIne2D.Double;

public class ColorNameComponent extends JComponent {
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
      g2.draw(newLine2D.Double(i, 0, i, 10));
    }
  }
}
