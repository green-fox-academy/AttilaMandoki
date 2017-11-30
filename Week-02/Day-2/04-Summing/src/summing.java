import java.util.Scanner;

public class summing {
  public static void main(String[] args) {

    System.out.println("Please enter a positive, whole number:");

    Scanner scanner = new Scanner(System.in);

    int userInput = scanner.nextInt();

    summing(userInput);

    System.out.println(summing(userInput));
  }

  public static int summing(int input) {
    int value = 0;
    //for (int i = 0; i < input +1; i++) <--- This gives the same result as below.
    for (int i = 0; i <= input; i++) {
      value += i;
    }
    return value;

  }
}
// - Write a function called `sum` that sum all the numbers
//   until the given parameter