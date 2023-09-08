import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; //Adds the tools nescessary to function several other stuff

public class Calculator { // Name of the file 
  public static void main(String args[]) { //Required
    LocalDateTime myDateTime = LocalDateTime.now();
    DateTimeFormatter myFormatTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDate = myDateTime.format(myFormatTime); //Setting up and formmating a clock so it appears Day/Month/Year Hours:Minutes:Seconds
    System.out.println("The time is: " + formattedDate); //Shows the clock at the top since it is the first print line
    System.out.println(" ");
    System.out.println("Made by Fizzy"); //Signature
    System.out.println(" ");
    try (Scanner num1 = new Scanner(System.in)) { //Used to read user input
      System.out.println("Enter number 1:");
      try (Scanner num2 = new Scanner(System.in)) {
        System.out.println("Enter number 2:");
        try (Scanner num3 = new Scanner(System.in)) {
          System.out.println("(Not Required) Enter Number 3:"); //Shows 3 messages Enter numbers 1(2)(3) which are 3 differnt messages as replies

          double X = num1.nextInt(); //Sets the numbers to variables that the user listed in the response
          double Y = num2.nextInt();
          double Z = num3.nextInt();
          if (X == 0) { //So that it still does calculations with a missing number
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
          if (Y == 0) { //repeat of the previous but with a different missing variable
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
          if (Z == 0) { //Most common missed variable
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
              if (Z != 0) { //if all 3 variables are given a value it does the calculations for all 3 in the order of operations
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
} //Used to finish the code blocks
