package staticstuff;

class Car {
  static int MAX_DESIGN_SPEED = 100;
  static int NUMBER_OF_SEATS = 4;

  private int speed;
  private String color;
  private int passengerCount;

  public Car(int speed, String color, int passengerCount) {
    this.speed = speed;
    this.color = color;
    this.passengerCount = passengerCount;
  }

  @Override
  public String toString() {
    return "Car{" +
        "speed=" + speed +
        ", color='" + color + '\'' +
        ", passengerCount=" + passengerCount +

        ", MAX_DESIGN_SPEED=" + MAX_DESIGN_SPEED +
        ", NUMBER_OF_SEATS=" + NUMBER_OF_SEATS +
        '}';
  }
}


public class CarExample {
  public static void main(String[] args) {
    Car c1 = new Car(50, "Red", 2);
    Car c2 = new Car(0, "Blue", 0);

    System.out.println("c1 " + c1);
    System.out.println("c2 " + c2);
    Car.MAX_DESIGN_SPEED = 250;
//    c1.MAX_DESIGN_SPEED = 250;
    System.out.println("c1 " + c1);
    System.out.println("c2 " + c2);
  }
}
