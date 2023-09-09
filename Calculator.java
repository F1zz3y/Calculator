import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Calculator {
  /**
   * @param args
   */
  public static void main(String args[]) {
    LocalDateTime myDateTime = LocalDateTime.now();
    DateTimeFormatter myFormatTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDate = myDateTime.format(myFormatTime);
    System.out.println("The time is: " + formattedDate);
    System.out.println(" ");
    System.out.println("Made by Fizzy");
    System.out.println(" ");
    try (Scanner num1 = new Scanner(System.in)) {
      System.out.println("Enter number 1:");
      try (Scanner num2 = new Scanner(System.in)) {
        System.out.println("Enter number 2:");
        try (Scanner num3 = new Scanner(System.in)) {
          System.out.println("(Not Required) Enter Number 3:");

          double X = num1.nextInt();
          double Y = num2.nextInt();
          double Z = num3.nextInt();
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
    }
  }
}
