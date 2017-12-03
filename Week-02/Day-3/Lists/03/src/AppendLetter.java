import java.util.*;

public class AppendLetter{
  public static void main(String... args) {
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
    // Add "a" to every string in the far list.

    for (int i = 0; i < far.size(); i++) {
      String addA = far.get(i);
      addA = addA + "a";
      far.set(i, addA);
    }
    System.out.println(far);
  }
}