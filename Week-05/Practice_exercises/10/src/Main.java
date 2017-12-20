import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    /*
    Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes,
    it's up to you how you name/create them! Write a function to find the foxes with green color!
    Write a function to find the foxes with green color and pallida type!
    */

    Fox fox1 = new Fox("Vincent", "corsac", "green");
    Fox fox2 = new Fox("Punk", "japonica", "pink");
    Fox fox3 = new Fox("Mongo", "pallida", "red");
    Fox fox4 = new Fox("Cobus", "karagan", "azure");
    Fox fox5 = new Fox("Sorcerer", "pallida", "green");

    //Contacts.add(new Data(name, address, contact));

    List<Fox> bagOfFoxes = new ArrayList<>();

    bagOfFoxes.add(fox1);
    bagOfFoxes.add(fox2);
    bagOfFoxes.add(fox3);
    bagOfFoxes.add(fox4);
    bagOfFoxes.add(fox5);

    System.out.println(foxInABag(bagOfFoxes));

  }

  public static String foxInABag(ArrayList<Fox> inputList) {
    String greenFoxes = "";
    String greenPallidaFoxes = "";
    String badCatch = "You've got bit by a nasty fox!";
    for (int i = 0; i < inputList.size(); i++) {
      if (inputList.contains("green")) {
        greenFoxes = inputList.get(i);
        return greenFoxes;
      } else if (inputList.contains("green") && inputList.contains("pallida")) {
        greenPallidaFoxes = inputList.get(i);
        return greenPallidaFoxes
      } else {
      }
    }
    return badCatch;
  }
}
