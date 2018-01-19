package passbyvalue;

public class Ex1 {
  static void addOne(int i) {
    i++;
    System.out.println("i is now " + i);
  }

  static void addWorld(StringBuilder sb) {
    sb.append("world");
    System.out.println("sb is " + sb);
  }

  static void addOne(int [] ia) {
    ia[0] ++;

    System.out.println("ia[0] is " + ia[0]);
  }

  public static void main(String[] args) {
    int f = 99;
    System.out.println("i before is " + f);
    addOne(f);
    System.out.println("i after is " + f);

    StringBuilder sb = new StringBuilder("Hello ");
    addWorld(sb);
    System.out.println("sb after is " + sb);

    int [] ia = {99};
    addOne(ia);
    System.out.println("ia[0] after call is " + ia[0]);
  }
}
