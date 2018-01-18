package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex1 {
  public static void main(String[] args) {
    // No constructors!
    LocalDate today = LocalDate.now();

    today = today.plusDays(10); // immutable, like a String

    System.out.println(today);

//    DateTimeFormatter format = DateTimeFormatter.ISO_DATE_TIME;
    DateTimeFormatter format = DateTimeFormatter.ofPattern("'Today is' MMM / D / YY");
    String asText = format.format(today);
    System.out.println(asText);
  }
}
