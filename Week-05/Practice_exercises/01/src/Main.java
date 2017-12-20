import java.util.ArrayList;

public class Main {
  //get the even numbers from the following array:
  public static void main(String[] args) {

    int[] n = {1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14};

    System.out.println(evenNumbers(n));

  }

  private static ArrayList evenNumbers(int[] inputList) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int anInputList : inputList) {
      if (anInputList % 2 == 0) {
        result.add(anInputList);
      }
    }
    return result;
  }
}
