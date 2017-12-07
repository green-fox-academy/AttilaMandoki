import java.util.Scanner;

public class Counter {
  public static void main(String[] args) {
    int n = InputX();
    recursion(n);

  }
  public static int InputX() {
    Scanner newScanner = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int numberTaken = newScanner.nextInt();

    return numberTaken;

  }

  public static void recursion(int n) {
    if (n == 0) {
      System.out.println("Please enter a number greater than 0.");
    } else {
      System.out.println(n);
      recursion(n - 1);
    }
  }
}
// Write a recursive function that takes one parameter: n and counts down from n.