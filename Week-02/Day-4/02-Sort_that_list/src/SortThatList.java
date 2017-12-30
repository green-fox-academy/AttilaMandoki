import java.util.ArrayList;
import java.util.Scanner;

public class SortThatList {

  public static void main(String[] args) {

    System.out.println("Please enter a list of numbers in a random order separated by spaces.\n" +
            "Then type in \"Y\" and hit the enter button!");

    Scanner scanner = new Scanner(System.in);

    ArrayList<Integer> inputList = new ArrayList<>();

    while (scanner.hasNextInt()) {
      inputList.add(scanner.nextInt());

      for (int i = 0; i < inputList.size(); i++) {
        for (int j = 0; j < inputList.size() - i - 1; j++) {
          if (inputList.get(j) > inputList.get(j + 1)) {
            int temporary = inputList.get(j);
            inputList.set(j, inputList.get(j + 1));
            inputList.set(j + 1, temporary);
          }
        }
      }
      System.out.println(inputList);
    }
  }
}
/*
Create a function that takes a list of numbers as parameter
Returns a list where the elements are sorted in ascending numerical order
Make a second boolean parameter, if it's true sort that list descending
Example
input [34, 12, 24, 9, 5]
output [5, 9, 12, 24, 34]
*/