import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    //find which number squared value is more then 20 from the following array:
    int[] n = {3, 9, 2, 8, 6, 5};

    System.out.println(largerThanTwenty(positiveNumbers(n)));

  }

  private static ArrayList positiveNumbers(int[] inputArray) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int anInputArray : inputArray) {
      result.add(anInputArray * anInputArray);
    }
    return result;
  }

  private static ArrayList largerThanTwenty(ArrayList<Integer> inputList) {
    ArrayList<Integer> finalResult = new ArrayList<>();
    for (Integer anInputList : inputList) {
      if (anInputList > 20) {
        finalResult.add(anInputList);
      }
    }
    return finalResult;
  }
}