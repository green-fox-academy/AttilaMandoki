import java.lang.reflect.Array;

public class ChangeElements {
  public static void main(String[] args) {

    int[] s= new int[6];

    s[0] = 1;
    s[1] = 2;
    s[2] = 3;
    s[3] = 8;
    s[4] = 5;
    s[5] = 6;

    s[3] = 4;

    System.out.print(s[3]);
  }
}
/*
-Create an array variable named `s`
 with the following content: `[1, 2, 3, 8, 5, 6]`
- Change the 8 to 4
- Print the fourth element
*/