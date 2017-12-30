import java.util.ArrayList;
import java.util.Scanner;

public class Unique {

  public static void main(String[] args) {

    System.out.println("Please enter a list of numbers separated by spaces.\nMake sure that there are duplicate" +
            " elements in it, then type in \"Y\" and hit the enter button!");
    Scanner userList = new Scanner(System.in);

    ArrayList<Integer> inputList = new ArrayList<>();

    while (userList.hasNextInt()) {
      inputList.add(userList.nextInt());

      for (int i = 0; i < inputList.size(); i++) {
        for (int j = i + 1; j < inputList.size(); j++) {
          if (inputList.get(i).equals(inputList.get(j))) {
            inputList.remove(j);
            System.out.println(inputList);
            break;
          }
        }
      }
    }
  }
}


/*
Create a function that takes a list of numbers as a parameter
Returns a list of numbers where every number in the list occurs only once
Example:
input: [1, 11, 34, 11, 52, 61, 1, 34]
output: [1, 11, 34, 52, 61]
*/