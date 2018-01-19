package casting;

interface Showable {
  void hide();
}

class VideoBook extends Book implements Showable {

  @Override
  public void hide() {
    System.out.println("Video Book hiding....");
  }
}
class StageActor implements Showable {
  public void hide() {
    System.out.println("sneaking into the wings of the stage!");
  }
}

class Rectangle {
  int x, y, w, h;
  @Override
  public String toString() {
    return "I'm a Rectangle";
  }
}

class Window extends Rectangle implements Showable {
  public void hide() {
    System.out.println("Window Hiding!");
  }
  @Override
  public String toString() {
    return "I'm a Window!";
  }
}

class Book extends Rectangle {
  public String getTitle() {
    return "Pride and Prejudice";
  }
  @Override
  public String toString() {
    return "Don't bother me, I'm reading!";
  }
}

public class Ex1 {
  public static void main(String[] args) {
    Showable r = new Window();

    System.out.println(r.toString());
//    r.hide(); // doesn't compile
    ((Window)r).hide();

// BECAUSE, this is impossible (String ain't a Rectangle)
//    r = new String("Hello");
// THEREFORE this couldn't EVER POSSIBLY work, and is rejected
//    ((String)r).toUpperCase();

    Showable s1 = new VideoBook();
//    Book b = s1;

    System.out.println(((Book)s1));
  }
}
