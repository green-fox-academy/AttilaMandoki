import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    //find the frequency of numbers in the following array:
    int[] n = new int[]{5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2};

    System.out.println(occurrencesOfNumbers(n));

  }

  private static HashMap occurrencesOfNumbers(int[] inputArray) {
    HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
    for (int anInputArray : inputArray) {
      if (resultMap.containsKey(anInputArray)) {
        resultMap.put(anInputArray, resultMap.get(anInputArray) + 1);
      } else {
        resultMap.put(anInputArray, 1);
      }
    }
    return resultMap;
  }
}
