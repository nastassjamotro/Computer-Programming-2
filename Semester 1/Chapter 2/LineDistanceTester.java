// Nastassja Motro

/* P2.8: Write a program LineDistanceTester that constructs a line joining the points (100, 100) and (200, 200), then constructs points
(100, 200), (150, 150), and (250, 50). Print the distance from the line to each of the three points, using the ptSegDist method of the 
Line2D class. Also print the expected values. (Draw a sketch on graph paper to find what values you expect.) */

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class LineDistanceTester {
  public static void main(String[] args) {
    Point2D.Double pt1 = new Point2D.Double(100, 100);
    Point2D.Double pt2 = new Point2D.Double(200, 200);
    Point2D.Double pt3 = new Point2D.Double(100, 200);
    Point2D.Double pt4 = new Point2D.Double(150, 150);
    Point2D.Double pt5 = new Point2D.Double(250, 50);
    
    Line2D.Double segment = new Line2D.Double(pt1, pt2);
    
    System.out.println("Distance from pt3: " + segment.ptSegDist(pt3));
    System.out.println("Distance from pt4: " + segment.ptSegDist(pt4));
    System.out.println("Distance from pt5: " + segment.ptSegDist(pt5));
  }
}
