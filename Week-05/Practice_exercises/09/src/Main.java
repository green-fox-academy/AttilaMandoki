public class Main {

  public static void main(String[] args) {
    //convert a char array to a string
    char[] myCharArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};

    System.out.println(helloWorld(myCharArray));

  }


  private static String helloWorld(char[] inputCharArray) {
    StringBuilder returnedString = new StringBuilder("");
    for (int i = 0; i < inputCharArray.length; i++) {
      returnedString.append(inputCharArray[i]);
    }
    return returnedString.toString();
  }
}
