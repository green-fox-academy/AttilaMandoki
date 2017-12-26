import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // The program's aim is to collect your favourite animals and store them in a text file.
    // There is a given text file called '''favourites.txt''', it will contain the animals
    // If ran from the command line without arguments
    // It should print out the usage:
    // ```java FavouriteAnimals [animal] [animal]```
    // You can add as many command line arguments as many favourite you have.
    // One animal should be stored only at once
    // Each animal should be written in separate lines
    // The program should only save animals, no need to print them

    List<String> myFavorites = new ArrayList<>();
    myFavorites.add("First line of my file");
    try {
      Path filePath = Paths.get("favourites.txt");
      Files.write(filePath, myFavorites);
    } catch (Exception e) {
      System.out.println("Uh-oh, could not write the file!");
    }
  }
}