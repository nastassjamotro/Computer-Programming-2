// Nastassja Motro 10/24/17

public class Triangle {
  private int x1, y1, x2, y2, x3, y3;
  private Point p1, p2, p3;
  
  this.p1 = new Point(x1,y1);
  this.p2 = new Point(x2,y2);
  this.p3 = new Point(x3,y3);
  
  public double getSideA() {
    double length = p2.distance(p3);
    return length;
  }
  
  public double getSideB() {
    double length = p1.distance(p2);
    return length;
  }
  
  public double getSideC() {
    double length = p1.distance(p3);
    return length;
  }
  
  public double getAngleA() {
    double as = getSideA();
    double bs = getSideB();
    double cs = getSideC();
    double angle = Math.acos((bs*bs + cs*cs - as*as) / (2*bs*cs));
    return angle;
  }
  
  public double getAngleB() {
    double as = getSideA();
    double bs = getSideB();
    double cs = getSideC();
    double angle = Math.acos((as*as + cs*cs - bs*bs) / (2*as*cs));
    return angle;
  }
  
  public double getAngleC() {
    double as = getSideA();
    double bs = getSideB();
    double cs = getSideC();
    double angle = Math.acos((as*as + bs*bs - cs*cs) / (2*as*bs));
    return angle;
  }
  
  public double getPerimeter() {
    double as = getSideA();
    double bs = getSideB();
    double cs = getSideC();
    double perimeter = (as + bs + cs);
    return perimter;
  }
  
  double getSaidArea() {
    double saidArea = 0.5 * (p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY());
    return saidArea;               
  }
                             
  public double getArea() {
    return Math.abs(getSaidArea());
  }                           
}
