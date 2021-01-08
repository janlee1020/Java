import java.util.Scanner;

/*
 * author: Janet Lee
 * version: hw02
 * */

public class PA1 
{

  public static void main (String[] args)
  {
    Scanner scan= new Scanner(System.in);
    String commname;
    String sciname;
    int circum;
    int height;
    int largcrown;
    int narcrown;
    int avgcrown;
    int totpoints;
    
    System.out.print("Enter the common name: ");
    commname=scan.next();
    
    System.out.print("Enter the scientific name: ");
    sciname=scan.next() + " " + scan.next();
    
    System.out.print("Enter the circumference in inches: ");
    circum=scan.nextInt();
    
    System.out.print("Enter the height in feet: ");
    height=scan.nextInt();
    
    System.out.print("Enter the largest crown spread in feet: ");
    largcrown=scan.nextInt();
    
    System.out.print("Enter the smallest crown spread in feet: ");
    narcrown=scan.nextInt();
    
    avgcrown= ((largcrown + narcrown)/2);
    totpoints= circum + height + (avgcrown/4);
    
    System.out.print("Big Tree Report: \n");
    System.out.println("\n");
    System.out.print("    Common name: " + commname + "\n");
    System.out.print("Scientific name: " + sciname + "\n");
    System.out.println("\n");  
    System.out.print("  Circumference: " + circum + "\n");
    System.out.print("         Height: " + height + "\n");
    System.out.print("  Average Crown: " + avgcrown + "\n");
    System.out.println("\n");
    System.out.print("   Total Points: " + totpoints + "\n");
  }
  public static String allStrings(String commname, String sciname) {
    return " ";
  }
  public static int allInts(int circum, int height, int largcrown, int narcrown) {
    return 0;
  }
}
  
      
      
      
      
    
      
    