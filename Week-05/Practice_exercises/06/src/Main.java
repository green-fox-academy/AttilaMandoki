import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    //find the frequency of characters in a given string!
    String myString = "find the frequency of characters in a given string";

    System.out.println(occurrencesOfCharacters(myString));
  }

  private static HashMap<Character, Integer> occurrencesOfCharacters(String inputString) {
    HashMap<Character, Integer> mapOfLetters = new HashMap<Character, Integer>();
    String noWhiteSpace = inputString.replaceAll("\\s+", "");
    for (int i = 0; i < noWhiteSpace.length(); i++) {
      char c = noWhiteSpace.charAt(i);
      Integer val = mapOfLetters.get(c);
      if (val != null) {
        mapOfLetters.put(c, val + 1);
      } else {
        mapOfLetters.put(c, 1);
      }
    }
    return mapOfLetters;
  }
}
