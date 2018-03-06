// Nastassja Motro 3/5/18

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class KeyMap {
  public static String mappings[][] = {
    {"0"}, {"1"}, {"A", "B", "C"}, ... // need to finish
  };
  
  public static void generateHelper(List<String> combos, String prefix, String remaining) {
    // digit working with
    int digit = Integer.parseInt(remaining.substring(0, 1));
    
    if (remaining.length() == 1) {
      for (int i = 0; i < mappings[digit].length; i++) {
        combos.add(prefix + mappings[digit][i]);
      }
    } else {
      for (int i = 0; i < mappings[digit].length; i++) {
        generateHelper(combos, prefix + mappings[digit][i], remaining.substring(1));
      }
    }
  }
  
  public static List<String> generateCombos(String number) {
    List<String> combos = new LinkedList<String>();
    generateHelper(combos, "", number);
    return combos;
  }
  
  public static void main(String[] args) {
    System.out.println("Welcome to this key mapping thing...program...");
    System.out.println("This program is supposed to take in a 5 digit number and then give you words back based on the corresponding phone keypad");
    
  }
}
