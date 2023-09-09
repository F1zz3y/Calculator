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
          try (Scanner myop = new Scanner(System.in)) {
            System.out.println("(Using arithmetic symbols \"+ - * /\") what operation: ");

            double X = num1.nextInt();
            double Y = num2.nextInt();
            double Z = num3.nextInt();
            String myAdd = "+";
            String mySub = "-";
            String myMul = "*";
            String myDiv = "/";
            String myOp = "myop.nextLine()";
          if (X == 0) {
            if (myAdd.equals(myOp)); {
              System.out.println("2 Number addition is");
              System.out.println(Y + Z);
            }
            if (myMul.equals(myOp)); {
              System.out.println("2 Number multiplication is");
              System.out.println(Y * Z); 
            }
            if (myDiv.equals(myOp)); {
              System.out.println("2 Number division is");
              System.out.println(Y / Z); 
            }
            if (mySub.equals(myOp)); {
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
              System.out.println("2 Number division is");
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
              System.out.println("2 Number multiplication is");
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
                    System.out.println("3 Number multiplication is");
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
}