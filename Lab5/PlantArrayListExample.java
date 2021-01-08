import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // TODO: Define a PrintArrayList method that prints an ArrayList of plant (or flower) objects 
  public static void PrintArrayList(ArrayList <Plant> array) {
    for (int i = 0; i < array.size(); i++) {
      Plant plant = array.get(i);
      plant.printInfo();
    }
  }
        
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      ArrayList <Plant> myGarden = new ArrayList <Plant> ();
      // TODO: Declare variables - plantName, plantCost, colorOfFlowers, isAnnual
      String plantName;
      String plantCost;
      String colorOfFlowers;
      boolean isAnnual;
      
      input = scnr.next();
      Plant plant[] = new Plant[20];
      Flower flower[] = new Flower [20];
      int p = 0;
      int f = 0;
      while(!input.equals("-1")){
         // TODO: Check if input is a plant or flower
         //       Store as a plant object or flower object
         //       Add to the ArrayList myGarden
        if (input.equals("plant")) {
          plant[p]= new Plant ();
          plantName = scnr.next();
          plantCost = scnr.next();
          plant[p].setPlantName(plantName);
          plant[p].setPlantCost(plantCost);

          myGarden.add(plant[p]);
          p++;
        }
        if (input.equals("flower")) {
          flower[f]= new Flower();
          plantName = scnr.next();
          plantCost = scnr.next();
          isAnnual= scnr.nextBoolean();
          if (isAnnual == true) {
            isAnnual= true;
          }
          else {
            isAnnual = false;
          }    
          colorOfFlowers = scnr.next();
          flower[f].setPlantName(plantName);
          flower[f].setColorOfFlowers(colorOfFlowers);
          flower[f].setPlantType(isAnnual);
          flower[f].setPlantCost(plantCost);
          myGarden.add(flower[f]);
          f++; 
      }
      input = scnr.next();
      }
      // TODO: Call the method PrintArrayList to print myGarden
      PrintArrayList(myGarden);
   }
}