import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {

    Scanner number = new Scanner(System.in);

    System.out.println("Please enter a positive, whole number:");

    int userInput = number.nextInt();

    factorial(userInput);

    System.out.println(factorial(userInput));


  }

  public static int factorial(int input) {
    int value = 1;
    for (int f = 2; f <= input; f++) {
      value *= f;
    }
    return value;
  }
}
