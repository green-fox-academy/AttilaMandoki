import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    //get the squared value of the positive numbers from the following array:
    int[] n = {1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14};

    System.out.println(positiveNumbers(n));
  }

  private static ArrayList positiveNumbers(int[] inputArray) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int anInputArray : inputArray) {
      if (anInputArray > 0) {
        result.add(anInputArray * anInputArray);
      }
    }
    return result;
  }
}