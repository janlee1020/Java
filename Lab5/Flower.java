public class Flower extends Plant{
    boolean isAnnual;
    String colorOfFlowers;
    
  public void setPlantType(boolean userIsAnnual) {
    isAnnual=userIsAnnual;
  }
  
  public boolean getPlantType() {
    return isAnnual;
  }
  
  public void setColorOfFlowers(String userColorOfFlower) {
    colorOfFlowers=userColorOfFlower;
  }
  
  public String getColorOfFlowers() {
    return colorOfFlowers;
  }
  
  public void printInfo() {
    
  }
}