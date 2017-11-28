// Nastassja Motro 11/27/17

import java.util.Scanner;

public class TicTacToe {
  public static void main(String[] args) {
    String [][] board = getBoard();
    String[] pieces = {"X", "O"};
    int end;
    
    do {
      print(board);
      int[] cell = getCell(board, pieces[0]);
      placeToken(board, cell, pieces[0]);
      end = gameStatus(board, pieces[0]);
      if (result == 2) {
        swap(pieces);
      } while (result == 2);
      
      print(board);
      if (result == 0) {
        System.out.println(pieces[0] + "player won");
      } else {
        System.out.println("Players draw");
      }
      
      public static int gameStatus(String[][] i, String j) {
        if (isWin(i, j)) {
          return 0;
        } else if (isDraw(i)) {
          return 1;
        } else {
          return 2;
        }
        
        public static boolean isWin(String[][] i, String j) {
          return isHorizontalWin(i, j) || isVerticalWin(i, j) || isDiagonalWin(i, j);
        }
        
        public static boolean isHoriztonalWin(String[][] i, String j) {
          for (int x = 0; x < i.length; x++) {
            int count = 0;
            for (int y = 0; y < i[x].length; y++) {
              if (i[x][y] == j) {
                count ++;
              }
            }
            if (count == 3) {
              return true;
            }
          }
          return false;
        }
        
        public static boolean isVerticalWin(String[][] i, String j) {
          for (int x = 0; x < i.length; x++) {
            int count = 0;
            for (int y = 0; y < i[x].length; y++) {
              if (i[y][x] == j) {
                count++;
              }
            }
            if (count == 3) {
              return true;
            }
          }
          return false;
        }
        
        public static boolean isDiagonalWin(String[][] i, String j) {
          int count = 0;
          for (int x = 0; x < i.length; x++) {
            if (i[x][x] == j) {
              count++;
            }
            if (count == 3) {
              return true;
            }
          }
          
          count = 0;
          for (int x = 0, y = i[x].length - 1; y >= 0; y--, x++) {
            if (i[x][y] == j) {
              count++;
            }
            if (count == 3) {
              return true;
            }
          }
          return false;
        }
        
        public static boolean isDraw(String[][] i) {
          for (int x = 0; x < i.length; x++) {
            for (int y = 0; y < i[x].length; y++) {
              if (i[x][y] == " ") {
                return false;
              }
            }
          }
          return true;
        }
        
        public static void swap(String[] i) {
          String temp = i[0];
          i[0] = i[1];
          i[1] = temp;
        }
        
        public static void placePiece(String[][] i, int[] j, String k) {
          i[j[0]][j[1]] = k;
        }
        
        public static int[] getCell(String[][] i, String j) {
          Scanner scan = new Scanner(System.in);
          int[] cell = new int[2];
          do {
            System.out.print("Enter a row(0, 1, or 2) for player " + j + ": ");
            cell[0] = scan.nextInt();
            System.out.print("Enter a column(0, 1, or 2) for player " + j + ": ");
            cell[1] = scan.nextInt();
          } while (!isValidCell(i, cell));
          return cell;
        }
        
        public static boolean isValidCell(String[][] i, int[] cell) {
          for (int x = 0; x < cell.length; x++) {
            if (cell[x] < 0 || cell[x] >= 3) {
              System.out.println("Invalid cell");
              return false;
            }
          }
          if (i[cell[0]][cell[1]] != "  ") {
            System.out.println("\nRow " + cell[0] + " column " + cell[1] + " is filled");
            return false;
          }
          return true;
        }
        
        public static String[][] getBoard() {
          String[][] i = new String[3][3];
          for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
              i[x][y] = "  ";
            }
          }
          return i;
        }
        
        public static void print(String[][] i) {
          System.out.println("\n-------------");
          for (int x = 0; x < i.length; x++) {
            for (int y = 0; y < i[x].length; y++) {
              System.out.print("|" + i[x][y]);
            }
            System.out.println("|\n-------------");
          }
        }
      }
    }
  }
}
