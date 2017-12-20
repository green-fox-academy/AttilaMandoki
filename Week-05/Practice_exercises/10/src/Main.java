import java.util.ArrayList;

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

    ArrayList<Fox> bagOfFoxes = new ArrayList<>();

    bagOfFoxes.add(fox1);
    bagOfFoxes.add(fox2);
    bagOfFoxes.add(fox3);
    bagOfFoxes.add(fox4);
    bagOfFoxes.add(fox5);

    System.out.println(foxInABag(bagOfFoxes));

  }

  public static ArrayList<Fox> foxInABag(ArrayList<Fox> inputList) {
    ArrayList greenFoxes = new ArrayList<>();

    for (int i = 0; i < inputList.size(); i++) {
      if (inputList.get(i).getColor().equals("green")) {
        greenFoxes.add(inputList.get(i));
      }
    }
    return greenFoxes;
  }
}