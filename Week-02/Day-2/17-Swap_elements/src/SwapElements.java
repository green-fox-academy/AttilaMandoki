import java.util.Arrays;

public class SwapElements {
  public static void main(String[] args) {

    String abc[] = new String[3];

    abc[0] = "first";
    abc[1] = "second";
    abc[2] = "third";

    int src = 0;
    String temp = abc[src];
    abc[0] = abc[2];
    abc[2] = temp;

    System.out.println(Arrays.deepToString(abc));

  }
}
/*
- Create an array variable named `abc`
with the following content: `["first", "second", "third"]`
- Swap the first and the third element of `abc`
*/
