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

    System.out.println("Please enter the expression:\n(Use one of the following: +, -, *, /, %)");

    Scanner input = new Scanner(System.in);

    String userInput1 = input.nextLine();

    if (userInput1.equals("+")) {
      System.out.println("Enter the first operand:");
      int userInput2 = input.nextInt();
      System.out.println("Enter the second operand:");
      int userInput3 = input.nextInt();
      int result = userInput2 + userInput3;
      System.out.println(result);

    } else if (userInput1.equals("-")) {
      System.out.println("Enter the first operand:");
      int userInput2 = input.nextInt();
      System.out.println("Enter the second operand:");
      int userInput3 = input.nextInt();
      int result = userInput2 - userInput3;
      System.out.println(result);

    } else if (userInput1.equals("*")) {
      System.out.println("Enter the first operand:");
      int userInput2 = input.nextInt();
      System.out.println("Enter the second operand:");
      int userInput3 = input.nextInt();
      int result = userInput2 * userInput3;
      System.out.println(result);

    } else if (userInput1.equals("/")) {
      System.out.println("Enter the first operand:");
      int userInput2 = input.nextInt();
      System.out.println("Enter the second operand:");
      int userInput3 = input.nextInt();
      int result = userInput2 / userInput3;
      System.out.println(result);

    } else if (userInput1.equals("%")) {
      System.out.println("Enter the first operand:");
      float userInput2 = input.nextInt();
      System.out.println("Enter the second operand:");
      float userInput3 = input.nextInt();
      float result = (userInput3 / userInput2) * 100;
      System.out.println(result);
    }
  }
}