import java.util.*;

public class Anagram {
  public static void main(String[] args) {

    anagramChecker();

    }
    private static boolean anagramChecker() {

    System.out.println("Please enter two words:");

    Scanner scanner = new Scanner(System.in);

    String userInput1 = scanner.nextLine();
    String userInput2 = scanner.nextLine();

    char[] letters1 = userInput1.toCharArray();
    char[] letters2 = userInput2.toCharArray();

    Arrays.sort(letters1);
    Arrays.sort(letters2);

    String reArranged1 = new String(letters1);
    String reArranged2 = new String(letters2);

    boolean conclusion = reArranged1.equalsIgnoreCase(reArranged2);

      if (conclusion == true) {
        System.out.println("Yep");
      } else {
        System.out.println("Nope");
      }

    return conclusion;
  }
}