import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Doubled {

  public static void main(String[] args) {
  // Create a method that decrypts the duplicated-chars.txt

    decryptedText("src/duplicated-chars.txt");

  }

  public static void decryptedText(String inputFile) {
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
    for (int i = 0; i < charArray.length; i++) {
      if (charArray[i] % 2 == 0) {
        stringBuilder.append(i);
        System.out.println(stringBuilder.toString());
      }
    }
  }
  catch (IOException e) {
    System.out.println("D'oh!");
  }
}
}
