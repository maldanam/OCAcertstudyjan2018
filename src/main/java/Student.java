import java.util.*;
import java.util.function.Predicate;

// Behavior determining if a student is "smart"

//boolean isSmart(Student s) {
//  return s.getGpa() > 3
//    }

//interface StudentCriterion {
//  boolean test(Student s);
//}

//class SmartCriterion implements StudentCriterion {
class SmartCriterion implements Predicate<Student> {
  @Override
  public boolean test(Student s) {
    return s.getGpa() > 3.0F;
  }
}

//class EnthusiasticCriterion implements StudentCriterion {
class EnthusiasticCriterion implements Predicate<Student> {
  @Override
  public boolean test(Student s) {
    return s.getCourses().size() > 2;
  }
}

public class Student {
  private String name;
  private double gpa;
  private List<String> courses;

  public String getName() {
    return name;
  }

  public double getGpa() {
    return gpa;
  }

  public List<String> getCourses() {
    return courses;
  }

  // var args becomes an array................... v equivalent to [] but allowed to call
  // with variable length list.
  public Student(String name, double gpa, String... courses) {
    this.name = name;
    this.gpa = gpa;
    this.courses = Arrays.asList(courses);
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", gpa=" + gpa +
        ", courses=" + courses +
        '}';
  }

  public static void showAll(List<Student> ls) {
    for (Student s : ls) {
      System.out.println("> " + s);
    }
    System.out.println("-----------------------------");
  }

  // not a legitimate overload because of "type erasure"
//  public static List<Student> getParticularStudents(List<Date> ld, Predicate<Date> pd) {
//    return null;
//  }

  public static List<Date> getParticularStudents(Set<Date> sd, Predicate<Date> pd) {
    return null;
  }

  //  public static List<Student> getParticularStudents(List<Student> ls, StudentCriterion crit) {
  public static List<Student> getParticularStudents(List<Student> ls, Predicate<Student> crit) {
    List<Student> out = new ArrayList<>();
    for (Student s : ls) {
      if (crit.test(s)) {
        out.add(s);
      }
    }
    return out;
  }

  //  public static List<Student> getSmart(List<Student> ls, float threshold) {
//    List<Student> out = new ArrayList<>();
//    for (Student s : ls) {
//      if (s.gpa > threshold) {
//        out.add(s);
//      }
//    }
//    return out;
//  }
//
//  public static List<Student> getEnthusiastic(List<Student> ls) {
//    List<Student> out = new ArrayList<>();
//    for (Student s : ls) {
//      if (s.courses.size() > 2) {
//        out.add(s);
//      }
//    }
//    return out;
//  }
//
  public static void main(String[] args) {
    List<Student> school = Arrays.asList(
        new Student("Fred", 3.2F, "Maths", "Physics"),
        new Student("Sheila", 3.9F, "Maths", "Physics", "Chemistry"),
        new Student("Jim", 2.9F, "History")
    );

    showAll(school);
//    showAll(getSmart(school, 3.5F));
//    showAll(getEnthusiastic(school));

    showAll(getParticularStudents(school, new SmartCriterion()));
    showAll(getParticularStudents(school, new EnthusiasticCriterion()));
    showAll(getParticularStudents(school, s -> s.getGpa() < 3.6F));
  }
}
