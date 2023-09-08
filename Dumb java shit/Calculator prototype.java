import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    LocalDateTime myDateTime = LocalDateTime.now();
    DateTimeFormatter myFormatTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDate = myDateTime.format(myFormatTime);
    System.out.println("The time is: " + formattedDate);
    System.out.println(" ");
    int X = 420;
    int Y = 69;
    int Z = 0;
    if (X == 0) {
      System.out.println("2 Number addition is");
      System.out.println(Y + Z);
      System.out.println(" ");
      System.out.println("2 Number multiplication is");
      System.out.println(Y * Z);
      System.out.println(" ");
      System.out.println("2 Number division is");
      System.out.println(Y / Z);
      System.out.println(" ");
      System.out.println("2 Number subtraction is");
      System.out.println(Y - Z);
    }
    if (Y == 0) {
      System.out.println("2 Number addition is");
      System.out.println(X + Z);
      System.out.println(" ");
      System.out.println("2 Number multiplication is");
      System.out.println(X * Z);
      System.out.println(" ");
      System.out.println("2 Number division is");
      System.out.println(X / Z);
      System.out.println(" ");
      System.out.println("2 Number subtraction is");
      System.out.println(X - Z);
    }
    if (Z == 0) {
      System.out.println("2 Number addition is");
      System.out.println(X + Y);
      System.out.println(" ");
      System.out.println("2 Number multiplication is");
      System.out.println(X * Y);
      System.out.println(" ");
      System.out.println("2 Number division is");
      System.out.println(X / Y);
      System.out.println(" ");
      System.out.println("2 Number subtraction is");
      System.out.println(X - Y);
      }
    if (X != 0) {
      if (Y != 0) {
        if (Z != 0) {
          System.out.println("3 Number addition is");
          System.out.println(X + Y + Z);
          System.out.println(" ");
          System.out.println("3 Number multiplication is");
          System.out.println(X * Y * Z);
          System.out.println(" ");
          System.out.println("3 Number division is");
          System.out.println(X / Y / Z);
          System.out.println(" ");
          System.out.println("3 Number subtraction is");
          System.out.println(X - Y - Z);
        }
      }
    }
  }
}