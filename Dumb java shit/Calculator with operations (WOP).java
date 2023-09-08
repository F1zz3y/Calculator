import java.util.Scanner;
import java.time.LocalDateTime; //used to have functions later
import java.time.format.DateTimeFormatter;

public class Calculator {
  /**
   * @param args //sets the paramaters to the argument
   */
  public static void main(String args[]) {
    LocalDateTime myDateTime = LocalDateTime.now();
    DateTimeFormatter myFormatTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDate = myDateTime.format(myFormatTime); //sets the date and tells it at the top
    System.out.println("The time is: " + formattedDate);
    System.out.println(" ");
    System.out.println("Made by Fizzy"); //signature
    System.out.println(" ");
    try (Scanner num1 = new Scanner(System.in)) { //scans the users input for numbers after telling the user to input 3 numbers aka input
      System.out.println("Enter number 1:");
      try (Scanner num2 = new Scanner(System.in)) {
        System.out.println("Enter number 2:");
        try (Scanner num3 = new Scanner(System.in)) {
          System.out.println("(Not Required) Enter Number 3:");
          try (Scanner myop = new Scanner(System.in)) {
            System.out.println("(Using arithmetic symbols \"+ - * /\") what operation: "); //asks the user for airthmetic symbols for what operation is needed aka the input

            double X = num1.nextInt();
            double Y = num2.nextInt(); //sets the numbers to variables with decimals
            double Z = num3.nextInt(); //the input sent by the user
            String myAdd = "+";
            String mySub = "-";
            String myMul = "*"; //WOP tryna fix out bugs for the operations with the constants
            String myDiv = "/";
            String myOp = "myop.nextLine()"; //WOP sets user input here buggy
          if (X == 0) {
            if (myAdd.equals(myOp)); { //if it is an addition symbol then it calculates the numbers added
              System.out.println("2 Number addition is");
              System.out.println(Y + Z); //the output sent to the user
            }
            if (myMul.equals(myOp)); { //if it is a multiplication symbol then it calculates the numbers multiplied
              System.out.println("2 Number multiplication is");
              System.out.println(Y * Z); 
            }
            if (myDiv.equals(myOp)); { //if it is a division symbol then it calculates the numbers divided
              System.out.println("2 Number division is");
              System.out.println(Y / Z); 
            }
            if (mySub.equals(myOp)); { //if it is a subtraction symbol then it calculates the numbers subtracted
            System.out.println("2 Number subtraction is");
            System.out.println(Y - Z);
            }
          if (Y == 0) {
            if (myAdd.equals(myOp)); {
              System.out.println("2 Number addition is");
              System.out.println(X + Z);}
            if (myMul.equals(myOp)); 
            }
              System.out.println("2 Number multiplication is");
              System.out.println(X * Z); }
            if (myDiv.equals(myOp)); {
              System.out.println("2 Number division is"); //same as before
              System.out.println(X / Z); 
            }
            if (mySub.equals(myOp)); {
            System.out.println("2 Number subtraction is");
            System.out.println(X - Z); 
            }
          if (Z == 0) {
            if (myAdd.equals(myOp)); {
              System.out.println("2 Number addition is");
              System.out.println(X + Y);
            }
            if (myMul.equals(myOp)); {
              System.out.println("2 Number multiplication is"); //same as before
              System.out.println(X * Y); 
            }
            if (myDiv.equals(myOp)); {
              System.out.println("2 Number division is");
              System.out.println(X / Y); 
            }
            if (mySub.equals(myOp)); {
            System.out.println("2 Number subtraction is");
            System.out.println(X - Y); 
            }
          if (X != 0) {
            if (Y != 0) {
              if (Z != 0) {
                if (myAdd.equals(myOp)); {
                  System.out.println("3 Number addition is");
                  System.out.println(X + Y + Z);
                }
                if (myMul.equals(myOp)); {
                  System.out.println("3 Number multiplication is"); //same as before but with all 3 variables
                  System.out.println(X * Y * Z); 
                }
                if (myDiv.equals(myOp)); {
                  System.out.println("3 Number division is");
                  System.out.println(X / Y / Z); 
                }
                if (mySub.equals(myOp)); {
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
}
}
} //ends the code blocks to end the code
