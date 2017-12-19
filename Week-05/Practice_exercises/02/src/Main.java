public class Main {

  public static void main(String[] args) {

    int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

    System.out.println(addedOdds(n));

  }

  public static int addedOdds(int[] inputArray) {
    int result = 0;
    for (int i = 0; i < inputArray.length; i++) {
      if (inputArray[i] % 2 != 0) {
        result += inputArray[i];
      }
    }
    return result;
  }
}
