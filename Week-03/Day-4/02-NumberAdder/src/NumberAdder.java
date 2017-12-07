import java.util.Scanner;

public class NumberAdder {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int numberTaken = userInput.nextInt();
    System.out.print(adderFunction(numberTaken));

  }

  public static int adderFunction(int n) {
    if (n == 0) {
        return 0;
    } else {
        return adderFunction(n - 1) + n;
    }
  }
}

// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.