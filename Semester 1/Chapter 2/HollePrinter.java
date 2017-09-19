// Nastassja Motro 9/18/17

public class HollePrinter {
  public static void main(String[] args) {
    String testString = "Hello World.";
    String replacedString = testString.replaceAll("o", "~");
    String replacedString = testString.replaceAll("e", "o");
    String replacedString = testString.replaceAll("~", "e");
    System.out.println(testString);
  }
}
