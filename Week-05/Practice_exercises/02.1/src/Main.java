import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    //get the average value of the odd numbers from the following array:
    int[] n = {1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14};

    System.out.println(averageOfOdds(oddsInArray(n)));

  }

  private static ArrayList<Integer> oddsInArray(int[] inputArray) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int anInputArray : inputArray) {
      if (anInputArray % 2 != 0) {
        result.add(anInputArray);
      }
    }
    return result;
  }

  private static double averageOfOdds(ArrayList<Integer> oddsFromArray) {
    double summary = 0.0;
    for (Integer anOddsFromArray : oddsFromArray) {
      summary += anOddsFromArray;
    }
    double size = oddsFromArray.size();
    return summary / size;
  }
}
