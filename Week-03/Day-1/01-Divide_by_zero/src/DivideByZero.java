import java.util.*;

public class DivideByZero {
  public static void main(String[] args) {

    System.out.println("Please enter a number:");

    Scanner scanner = new Scanner(System.in);

    int userInput = scanner.nextInt();

    System.out.println(dividingFunction(userInput));
  }

  public static int dividingFunction(int Divisor) {

    int divisionResult = 10;
    try {
      divisionResult = 10 / Divisor;
    } catch (ArithmeticException exc) {
      System.out.println("Computer says no.");
    }
    return divisionResult;
  }
}

// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0