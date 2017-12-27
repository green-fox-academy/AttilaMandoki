import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
  public static void main(String[] args) {

    fileCopier("src/emptyFile.txt", "src/gattaca.txt");

  }
  public static void fileCopier(String copyTo, String copyFrom) {
    try {
      String readFile;
      FileReader fileReader = new FileReader(copyFrom);
      readFile = fileReader.toString();
      FileWriter fileWriter = new FileWriter(copyTo);
      fileWriter.write(readFile);
      fileWriter.flush();
      fileWriter.close();
    }
    catch (IOException e) {
      System.out.println("D'oh");
    }
  }
}
