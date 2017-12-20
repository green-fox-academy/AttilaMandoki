public class Main {

  public static void main(String[] args) {
    //get the sum of the odd numbers from the following array
    int[] n = {1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14};

    System.out.println(addedOdds(n));

  }

  private static int addedOdds(int[] inputArray) {
    int result = 0;
    for (int anInputArray : inputArray) {
      if (anInputArray % 2 != 0) {
        result += anInputArray;
      }
    }
    return result;
  }
}