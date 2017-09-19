  // Nastassja Motro 9/19/17
  
  public class DayTester {
    public static void main(String[] args) {
      Day todaysDate = new Day(2017, 9, 19);
      Day today = new Day();
      System.out.println("Today: ");
      System.out.println(today.toString());
      int moreDays = today.daysFrom(todaysDate + 10);
      System.out.print("New Date: ");
      System.out.println(moreDays);
    }
  }
