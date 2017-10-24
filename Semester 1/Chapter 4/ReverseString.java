// Nastassja Motro 10/24/17

import java.io.*;
import java.util.*;

public class ReverseString {
  public static void main(String[] args) {
    String input = "Hi there";
    StringBuilder input1 = new StringBuilder();
    input1.append(input);
    input1 = input1.reverse();
    for(i = 0; i < input.length(); i++) {
      System.out.print(input1.charAt(i));
    }
  }
}
