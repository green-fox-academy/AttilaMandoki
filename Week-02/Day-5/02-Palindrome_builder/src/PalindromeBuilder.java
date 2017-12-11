import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.*;

public class PalindromeBuilder {
  public static void main(String[] args) {

    System.out.println("Please enter a word: ");
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine();

    addReverse(userInput);

  }
  public static void addReverse(String reversedPart) {

    char[] palindromeLetters = new char[reversedPart.length()];

    for (int i = 0; i < reversedPart.length(); i++) {
      palindromeLetters[i] = reversedPart.charAt(reversedPart.length() -i -1);
    }
    System.out.println(reversedPart + String.valueOf(palindromeLetters));
  }
}
