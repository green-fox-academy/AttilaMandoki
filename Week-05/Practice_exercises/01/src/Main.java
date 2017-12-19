import java.util.ArrayList;
import java.util.List;

public class Main {
  //get the even numbers from the following array:
  public static void main(String[] args) {

    int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

    System.out.println(evenNumbers(n));

  }
  public static ArrayList<Integer> evenNumbers(int[] inputList){
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < inputList.length; i++) {
      if (i % 2 == 0) {
        result.add(i);
      }
    }
    return result;
  }
}
