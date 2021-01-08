import java.util.Scanner;
import java.util.ArrayList;

public class StatDriver {
  public static void main(String[] args) {
    ArrayList <double> data = new ArrayList <double> [20];
    Scanner input = new Scanner (System.in);
    while (input.hasNextDouble()) {
      data.add(input.nextDouble());
    } 
    Double mean = Stats.mean(data);
    
    if (args!=null && args.length>0) {
      if (args[0].toLowerCase().equals("std")) {
        double stdval= Stats.stddev(data);
        System.out.println("Standard Deviation: %.2f\n", stdval);
      }
      if(args[0].toLowerCase().equals("mean")){
        System.out.println("Mean: %.2f\n", mean);
      }
      }
    else {
        System.out.println("Mean: %.2f\n", mean);
      }
      }
}

      
      
        
          
        


        
    