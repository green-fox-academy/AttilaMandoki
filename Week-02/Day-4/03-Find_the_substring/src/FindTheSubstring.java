import java.util.Scanner;

public class FindTheSubstring {

  public static void main(String[] args) {

    System.out.println("Please enter a sentence:");

    Scanner scanner1 = new Scanner(System.in);
    String sentence = scanner1.next();
    sentence += scanner1.nextLine();

    System.out.println("Please enter one of the words from your sentence:");

    Scanner scanner2 = new Scanner(System.in);
    String word = scanner2.next();

    System.out.println(indexNumber(sentence, word));
  }

  public static int indexNumber(String whole, String part) {
    int start = 0;

    for (int i = 0; i < whole.length() - part.length(); i++) {
      if (whole.substring(i, i + part.length()).equals(part)) {
        start = i;
        break;
      } else {
        start = -1;
      }
    }
    return start;
  }
}
/*
Find part of an integer(?)
Create a function that takes two strings as a parameter
Returns the starting index where the second one is starting in the first one
Returns -1 if the second string is not in the first one
Example
input: "this is what I'm searching in", "searching"
output: 17
*/
