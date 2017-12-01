public class IncrementElement {
  public static void main(String[] args) {

    int[] t= new int[6];

    t[0] = 1;
    t[1] = 2;
    t[2] = 3;
    t[3] = 8;
    t[4] = 5;

    t[2] +=2;

    System.out.print(t[2]);
  }
}
/*
- Create an array variable named `t`
  with the following content: `[1, 2, 3, 4, 5]`
- Increment the third element
- Print the third element
 */