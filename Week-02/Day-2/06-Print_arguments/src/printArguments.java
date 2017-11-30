import java.util.Arrays;
import java.util.Scanner;

public class printArguments {
  public static void main(String[] args) {
    System.out.println("Enter number of lines:");

    Scanner scanner = new Scanner(System.in);

    int numberOfLines = scanner.nextInt();
    String[] wordsArray = new String[numberOfLines];

    for (int i = 0; i < numberOfLines; i++) {
      System.out.println("State number of line:" + i);

      String currentLine = scanner.next();
      wordsArray[i] = currentLine;

    }

    printArguments(wordsArray);

  }

  public static void printArguments(String... input) {

    System.out.println(Arrays.toString(input));

  }
}
