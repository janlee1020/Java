public class Car{
    private String make;
    private int year; 
    private double speed;
    
  public Car(String make, int year) {
    this.make=make;
    this.year=year;
    speed= 0.0;
  }
  public String toString (){
     return String.format("A %d %s that is going %.1f mph", year, make, speed);
  }
  public String getMake (){
    return make;
  }
  public double getSpeed (){
    return speed;
      
  }
  public int getYear (){
    return year;
  }
  
  public void accelerate (){
    speed += 5;   
  }
  
  public void brake (){
    speed -= 5;
  }
}