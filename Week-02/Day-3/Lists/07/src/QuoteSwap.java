import java.util.*;

public class QuoteSwap{
  public static void main(String... args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code
    //Original: “What I cannot create, I do not understand.”

    // Also, print the sentence to the output with spaces in between.
    Collections.swap(list, 2, 5);

    StringBuilder builder = new StringBuilder();
    for (String value : list) {
      builder.append(value + " ");
    }
    String RF = builder.toString();
    System.out.println(RF);
  }
}