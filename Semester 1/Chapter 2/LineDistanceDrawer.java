// Nastassja Motro

//P2.9: Repeat Exercise P2.8, but now write a graphical application that shows the line and the points. Draw each point as a tiny
circle. Use the drawString method to draw each distance next to the point, using calls
  g2.drawString("Distance: " + distance, p.getX(), p.getY()); */
  
import java.awt.Graphics;
import java.awt.Grahics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.Jcomponent;
import javax.swing.JFrame;

public class LineDistanceDrawer {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    
    frame.setSize(400, 400);
    frame.setTitle("Line and Points");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    DrawComp dc = new DrawComp();
    frame.add(dc);
    
    frame.setVisible(true);
  }
  
  public static class DrawComp extends JComponent {
    public void painComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;
      Point.Double pt1 = new Point.Double(100, 100);
      Point.Double pt2 = new Point.Double(200, 200);
      Point.Double pt3 = new Point.Double(100, 200);
      Point.Double pt4 = new Point.Double(150, 150);
      Point.Double pt5 = new Point.Double(250, 50);
    
      Line2D.Double segment = new Line2D.Double(pt1, pt2);
    
      Ellipse2D.Double e1 = new Ellipse2D.Double(100, 200, 3, 3);
      Ellipse2D.Double e2 = new Ellipse2D.Double(150, 150, 3, 3);
      Ellipse2D.Double e3 = new Ellipse2D.Double(250, 50, 3, 3);
    
      g2.draw(segment);
      g2.draw(e1);
      g2.draw(e2);
      g2.draw(e3);
    
      double d1 = segment.ptSegDist(pt3);
      double d2 = segment.ptSegDist(pt4);
      double d3 = segment.ptSegDist(pt5);
    
      g2.drawString("Distance: " + d1, 110, 210);
      g2.drawString("Distance: " + d2, 160, 160);
      g2.drawString("Distance: " + d3, 260, 60);
    }
  }
}
