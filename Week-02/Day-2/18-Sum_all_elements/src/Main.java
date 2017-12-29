public class Main {

  public static void main(String[] args) {
    // - Create an array variable named `ai`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Print the sum of the elements in `ai`

    int[] ai = {3, 4, 5, 6, 7};

    System.out.println(summing(ai));

  }

  private static int summing(int[] inputList) {
    int result = 0;
    for (int i = 0; i < inputList.length; i++) {
      result += inputList[i];
    }
    return result;
  }
}
