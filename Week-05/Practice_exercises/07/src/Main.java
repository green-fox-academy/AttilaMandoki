public class Main {

  public static void main(String[] args) {
    //find the strings which starts with A and ends with I in the following array:
    String[] cities = {"ROME","LONDON","NAIROBI","CALIFORNIA","ZURICH","NEW DELHI","AMSTERDAM","ABU DHABI","PARIS"};

    System.out.println(startsWithAEndsWithI(cities));

  }

  private static String startsWithAEndsWithI(String[] inputStrings) {
    StringBuilder wordInQuestion = new StringBuilder("");
    for (String inputString : inputStrings) {
      if (inputString.startsWith("A") && inputString.endsWith("I")) {
        wordInQuestion.append(inputString);
      }
    }
    return wordInQuestion.toString();
  }
}

