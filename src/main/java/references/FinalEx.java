package references;

public class FinalEx {

  public static void main(String[] args) {
//    /*final*/ String s = new String("Hello");
//    s = s.toUpperCase();
//    System.out.println(s);


//    final StringBuilder sb = new StringBuilder("Hello");
//    sb.append(" final world!"); // NO ASSIGNMENT
//    System.out.println(sb);

    final int x = 99;
    //x += 100; // RE-ASSIGNS to the variable x itself (it's NOT a pointer to an object)
    System.out.println(x);
  }
}
