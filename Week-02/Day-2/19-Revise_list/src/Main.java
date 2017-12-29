import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`

    int[] aj = {3, 4, 5, 6, 7};

    System.out.println(reverseList(aj));
  }

  private static String reverseList(int[] inputList) {
    int temporaryInt = 0;
    for (int i = 0; i < inputList.length / 2; i++) {
      temporaryInt = inputList[i];
      inputList[i] = inputList[inputList.length - 1 - i];
      inputList[inputList.length - 1 - i] = temporaryInt;
    }
    return Arrays.toString(inputList);
  }
}
