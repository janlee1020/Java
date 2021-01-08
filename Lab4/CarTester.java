public class CarTester {
  public static void main(String[] args) {
    Car car1;
    Car car2;
    car1 = new Car("Ford", 1997);
    car2 = new Car("Toyota", 2014);
    System.out.println(car1.toString());
    System.out.println(car2.toString());
    
    for (int i=0; i < 5; i++){
      car1.accelerate();System.out.println(car1.toString());
      car1.getSpeed();
    }
    for (int i=0; i < 3; i++){
      car2.accelerate();System.out.println(car2.toString());
      car2.getSpeed();
    }
    for (int i=0; i < 5; i++){
      car1.brake();System.out.println(car1.toString());
      car1.getSpeed();
    }
    System.out.println(car1.toString());
    System.out.println(car2.toString());
}
}