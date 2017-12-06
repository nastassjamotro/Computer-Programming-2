// Nastassja Motro 12/5/17

import java.util.Scanner;

public class ZipCode {
  public static void main(String[] args) {
    boolean cont = true;
    while (cont = true) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter in a zip code: ");
      int code = scan.nextInt();
      int check = checkDigit(code);
      String barcode = "|";
      barcode = digitToBarcode(check) + barcode;
      for (int i = 0; i < 5; i++) {
        barcode = digitToBarcode(check) + barcode;
        code /= 10;
      }
      barcode = "|" + barcode;
      System.out.println(barcode);
      System.out.println("Would you like to try another number? Y/N: ");
      String reply = scan.next();
      if (reply.charAt(0) == 'Y' || reply.charAt(0) == 'y') {
        cont = true;
      } else {
        System.exit(0);
      }
    }
    
    public static int checkDigit(int code) {
      int remaining = code;
      int sum = 0;
      while ( remaining > 0) {
        sum += remaing % 10;
        remaining /= 10;
      }
      return 10 - (sum % 10);
    }
    
    public static String digitToBarcode(int digit) {
      if (digit == 1) {
        return ":::||";
      } else if (digit == 2) {
        return "::|:|";
      } else if (digit == 3) {
        return "::||:";
      } else if (digit == 4) {
        return ":|::|";
      } else if (digit == 5) {
        return ":|:|:";
      } else if (digit == 6) {
        return ":||::";
      } else if (digit == 7) {
        return "|:::|";
      } else if (digit == 8) {
        return "|::|:";
      } else if (digit == 9) {
        return "|:|::";
      } else {
        return "||:::";
      }
    }
  }
}
