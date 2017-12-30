import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations:
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit

    System.out.println("Please enter a operation symbol!\n"
            + "(You can use the following: +, -, *, /, %)");
    Scanner scanner1 = new Scanner(System.in);
    String operation = scanner1.nextLine();

    System.out.println("Please enter the first positive, whole number: ");
    Scanner scanner2 = new Scanner(System.in);
    String operand1 = scanner2.nextLine();
    Double num1 = Double.parseDouble(operand1);

    System.out.println("Please enter the second positive, whole number: ");
    Scanner scanner3 = new Scanner(System.in);
    String operand2 = scanner3.nextLine();
    Double num2 = Double.parseDouble(operand2);

    if (operation.equals("+")) {
      System.out.println(num1 + num2);
    }
    else if (operation.equals("-")) {
      System.out.println(num1 - num2);
    }
    else if (operation.equals("*")) {
      System.out.println(num1 * num2);
    }
    else if (operation.equals("/")) {
      System.out.println(num1 / num2);
    }
    else if (operation.equals("%")) {
      System.out.println((num1 * num2) / 100);
    }
  }
}