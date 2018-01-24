package equality;

public class Ex1 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    StringBuilder sb1 = new StringBuilder(s1);
    StringBuilder sb2 = new StringBuilder(s1);

    System.out.println("s1.equals(sb1) " + (s1.equals(sb1)));
    System.out.println("s1 == sb1 " + ((Object)s1 == sb1));

    System.out.println("sb1.equals(sb2) " + sb1.equals(sb2));
    System.out.println("sb1 is " + sb1);
    System.out.println("sb2 is " + sb2);
    System.out.println("sb1.toString().equals(sb2.toString()) "
        + sb1.toString().equals(sb2.toString()));
  }
}
