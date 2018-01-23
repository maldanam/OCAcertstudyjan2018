package staticstuff;

class C {
  static void doStuff() {
    System.out.println("C.doStuff");
  }
  void doOther() {
    System.out.println("C.doOther");
  }
}
class D extends C {
  static void doStuff() {
    System.out.println("D.doStuff");
  }
  void doOther() {
    System.out.println("D.doOther");
  }
}
public class DynamicInvocation {

  public static void doUsefulStuffWithAC(C target) {
    System.out.println("Doing stuff with a C...");
    target.doOther();
  }

  public static void main(String[] args) {
    C c1 = new D();
    // Using reference variables to invoke static behaviors is BAD STYLE
    c1.doStuff();  // C type prefix gives C type behavior for STATIC behavior
    c1.doOther();  // object at end of reference decides behavior AT RUNTIME

    D.doStuff();
    C.doStuff();

    doUsefulStuffWithAC(c1);
  }
}
