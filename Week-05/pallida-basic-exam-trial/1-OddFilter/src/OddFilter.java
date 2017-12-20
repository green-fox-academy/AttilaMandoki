import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddFilter {

  public static void main(String[] args) {
    // Create a function that takes a list as a parameter,
    // and returns a new list with every odd element from the original list
    System.out.println(oddFilter(Arrays.asList(1, 2, 3, 4, 5)));
    // should print [1, 3, 5]
  }

  private static ArrayList<Integer> oddFilter(List<Integer> inputList) {
    ArrayList<Integer> resultList = new ArrayList<Integer>();
    for (int i = 0; i < inputList.size(); i++) {
      if (inputList.get(i) % 2 != 0) {
        resultList.add(inputList.get(i));
      }
    }
    return resultList;
  }
}