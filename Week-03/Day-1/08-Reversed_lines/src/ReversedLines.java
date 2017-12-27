import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt

    reversedText("src/reversed-lines.txt");

  }

    public static void reversedText (String inputFile){
      try {
        String theString = "";
        StringBuilder stringBuilder = new StringBuilder();

        File file = new File(inputFile);
        Scanner scanner = new Scanner(file);

        theString = scanner.nextLine();
        while (scanner.hasNextLine()) {
          theString = theString + "\n" + scanner.nextLine();
        }
        char[] charArray = theString.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            stringBuilder.append(i);
            System.out.println(stringBuilder.toString());
          }
        } catch (IOException e) {
        System.out.println("D'oh!");
    }
  }
}
