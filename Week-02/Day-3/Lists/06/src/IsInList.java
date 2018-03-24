import java.util.*;

public class IsInList {
  public static void main(String... args) {

    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    ArrayList<Integer> toBeChecked = new ArrayList<>(Arrays.asList(4, 8, 12, 16));

    if (list.containsAll(toBeChecked)) {
      System.out.println("Hoooray");
    } else {
      System.out.println("Noooooo");
    }
  }

}
