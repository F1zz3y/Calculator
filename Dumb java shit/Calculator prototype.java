import java.time.LocalDateTime; //Tools needed for functions later
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    LocalDateTime myDateTime = LocalDateTime.now();
    DateTimeFormatter myFormatTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDate = myDateTime.format(myFormatTime);
    System.out.println("The time is: " + formattedDate); //sets the date and time to tell the user
    System.out.println(" ");
    int X = 420;
    int Y = 69; //Based on what user wants change the variable
    int Z = 0;
    if (X == 0) { //missed variable ^
      System.out.println("2 Number addition is");
      System.out.println(Y + Z);
      System.out.println(" ");
      System.out.println("2 Number multiplication is"); //Does the calculations with the used variables
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
      System.out.println("2 Number multiplication is"); //same thing
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
      System.out.println("2 Number multiplication is"); //same thing
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
        if (Z != 0) { //if all variables have a value
          System.out.println("3 Number addition is");
          System.out.println(X + Y + Z);
          System.out.println(" ");
          System.out.println("3 Number multiplication is"); //calculates with 3 variables
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
} //closes the code blocks to end the system
