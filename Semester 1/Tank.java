// Nastassja Motro 9/6/17

import java.util.Scanner;

public class Tank {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to your very own Tanker Truck Calculator of sorts");
    System.out.println(" ");
    System.out.println("You even have your very own lovely truck to go with it");
    System.out.println("                  _______________________________________________________");
    System.out.println("                  |                                                      |");
    System.out.println("             /    |                                                      |");
    System.out.println("            /---, |                                                      |");
    System.out.println("       -----# ==| |                                                      |");
    System.out.println("       | :) # ==| |                                                      |");
    System.out.println("  -----'----#   | |______________________________________________________|");
    System.out.println("  |)___()  '#   |______====____   \___________________________________|");
    System.out.println(" [_/,-,\"--"------ //,-,  ,-,\\\   |/             //,-,  ,-,  ,-,\\ __#");
    System.out.println("     ( 0 )|===******||( 0 )( 0 )||-  o              '( 0 )( 0 )( 0 )||");
    System.out.println("----'-'--------------'-'--'-'-----------------------'-'--'-'--'-'--------------");
    System.out.println("This application will calculate how many 11,000 gallon trucks of water you will drink in your lifespan.");
    System.out.println("First, enter an approximate amount of water in ounces that you think you drink every day.");
    float oz = scan.nextFloat();
    System.out.println("Secondly, enter an approximate lifespan/lifetime that you want to calculate [how long do you think you're going to live/age]");
    float ls = scan.nextFloat();
    oz *= 365;
    oz *= ls;
    oz /= 128;
    oz /= 11000;
    System.out.println("So you will drink approximately " + oz + "  11,000 gallon tankers of water in your lifetime.");                  
  }
}
