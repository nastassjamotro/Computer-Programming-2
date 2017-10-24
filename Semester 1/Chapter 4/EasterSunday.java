// Nastassja Motro 10/24/17

public class EasterSunday {
  int a, b, c, d, e, g, h, j, k, m, r, n, p;
  
  public EasterSunday(int y) {
    a = y % 19;
    b = y / 100;
    c = y % 100;
    d = b / 4;
    e = b % 4;
    g = (8 + b + 13) / 25;
    h = (19 * a + b - d - g + 15) % 30;
    j = c / 4;
    k = c % 4;
    m = (a + 11 * h) / 310;
    r = (2 * e + 2 * j - k - h + m + 32) % 7;
    n = (h - m + r + 90) / 25;
    p = (h - m + r + n + 19) % 32;
  }
  
  public int getEasterSundayMonth() {
    return n;
  }
  
  public int getEasterSundayDay() {
    return p;
  }
}
