package constructions;

class Base {
  private int x = 99;
  {
    System.out.println("Instance initializer, x is " + x);
  }

  Base(String s) {
    System.out.println("Base initilizer with " + s);
  }
// compiler generated Default constructor ONLY IF no explicit constructors
  Base() {
    System.out.println("zero arg Base constructor");
  }
}

class Child extends Base {
  {
    System.out.println("Child instance initializer...");
//    System.out.println(y); // forward reference not peritted.
  }
  int y;
  // In the absence of ANY explicit constructors
  // compiler gives us "default"
  Child() {
    // implicit super() only if neither this, nor super...
//    super("Alan");
    this("Alan");
    System.out.println("zero arg constructor");
  }

  Child(String s) {
    super(s);
    System.out.println("Child constructor with one String arg...");
  }

  {
    System.out.println("y is " + y);
    System.out.println("Another child instance initializer");
  }
}

public class TryConstructors {
  public static void main(String[] args) {
    Base b = new Child();
    System.out.println("------------------------------");

    b = new Child("Frederick");
  }
}