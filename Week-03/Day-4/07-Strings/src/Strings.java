import java.util.Scanner;

public class Strings {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter a word or sentence that contains the letter \"x\": ");
    String myString = userInput.next();
    System.out.println(letterSwap(myString));

  }
  public static String letterSwap(String toBeChanged){
    if (!toBeChanged.contains("x")) {
      return toBeChanged;
    } else {
      return toBeChanged.replace("x", "y");
    }
  }
}
// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.