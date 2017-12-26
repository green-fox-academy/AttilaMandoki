import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountingLines {
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
  public static void main(String[] args) {
    try {
      Path filePath = Paths.get("src/gattaca.txt");
      List<String> lines = Files.readAllLines(filePath);
        System.out.println(lines.size());
    } catch (IOException e) {
      int x = 0;
      System.out.println(x);
    }
  }
}
