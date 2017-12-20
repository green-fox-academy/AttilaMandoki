public class Main {

  public static void main(String[] args) {
    //find the uppercase characters in a string
    String gattaca = "You wanna know how I did it? This is how I did it Anton: " +
            "I never saved anything for the swim back.";

    System.out.println(uppercaseLetters(gattaca));

  }

  private static String uppercaseLetters(String inputString) {
    StringBuilder returnedLetters = new StringBuilder("");
    for (int i = 0; i < inputString.length(); i++) {
      if (Character.isUpperCase(inputString.charAt(i))) {
        returnedLetters.append(inputString.charAt(i));
      }
    }
    return returnedLetters.toString();
  }
}