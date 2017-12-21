import java.util.ArrayList;

public class UniqueChars {

  public String uniqueCharacters(String inputString) {
    ArrayList<Character> charactersList = new ArrayList<>();
    int letterCount = 0;
    for (int i = 0; i < inputString.length(); i++) {
      for (int j = 0; j < inputString.length(); j++) {
        if (inputString.charAt(i) == inputString.charAt(j)) {
          letterCount++;
        }
      }
      if (letterCount == 1) charactersList.add(inputString.charAt(i));
      letterCount = 0;
    }
    return charactersList.toString();
  }
}