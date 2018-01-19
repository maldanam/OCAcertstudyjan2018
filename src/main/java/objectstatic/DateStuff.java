package objectstatic;

// structured data type
class Date {
  int day;
  int month;
  int year;

  public void populateDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
    // year = year; // SHORTHAND!!! Assume this
  }

//  public static void populateDate(Date d, int day, int month, int year) {
//    d.day = day;
//    d.month = month;
//    d.year = year;
//  }
//
  public String asText() {
    return this.month + "/" + this.day + "/" + this.year;
  }

//  public static String asText(Date d) {
//    return d.month + "/" + d.day + "/" + d.year;
//  }
//
  // NOT specific message related to ONE (above any other)

  public static Date smallestDay(Date a, Date b, Date c) {
    // System.out.println(this.day); static methods don't have "this"
    if (a.day < b.day && a.day < c.day) return a;
    if (b.day < c.day) return b;
    return c;
  }

  public static String firstDayOfYearAsDayOfWeek(int year) {
    return "Saturday"; // FAKE!!!! should use Zeller's congruence
  }

  public static int maxNumberOfDaysInAnyYear() {
    return 366;
  }
}

public class DateStuff {

  public static void main(String[] args) {
//    int birthDay = 12;
//    int birthYear = 1999;
//    int birthMonth = 12;
//
//    System.out.println("Birthday is " + birthMonth + " / " + birthDay + " / " + birthYear);
//
//    int otherBirthDay = 12;
//    int otherBirthYear = 1999;
//    int otherBirthMonth = 12;
//
//    System.out.println("Other Birthday is " + otherBirthMonth + " / " + otherBirthDay + " / " + otherBirthYear);

//    Date myBirthday = new Date();
//    Date.populateDate(myBirthday, 12, 12, 1999);
//    System.out.println("my birthday is " + Date.asText(myBirthday));

    Date myBirthday = new Date();
    myBirthday.populateDate(12, 12, 1999);
    System.out.println("my birthday is " + myBirthday.asText());
  }
}
