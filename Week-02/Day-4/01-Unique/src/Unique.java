import java.util.*;

public class Unique {

  public static void main(String[] args) {

    ArrayList<Integer> withDuplicates = new ArrayList<Integer>(inputList());
    System.out.println(withDuplicates);

  }

  public static List<Integer> inputList() {
    System.out.println("Please enter a list of numbers. Make sure that there are duplicate elements in it," +
            " then type in \"Y\"");
    Scanner userList = new Scanner(System.in);

    ArrayList<Integer> inputList = new ArrayList<Integer>();

    while (userList.hasNextInt()) {
      inputList.add(userList.nextInt());

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