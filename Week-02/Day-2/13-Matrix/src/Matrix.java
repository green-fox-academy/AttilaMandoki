public class Matrix {
  public static void main(String[] args) {

    int xy[][] = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};

    array(xy);
  }

  public static void array(int xy[][]) {
    for (int row = 0; row < xy.length; row++) {
      for (int column = 0; column < xy[row].length; column++) {

        System.out.print(xy[row][column]);
      }
      System.out.println("\t");
    }
  }
}
/*
- Create (dynamically) a two dimensional array
with the following matrix. Use a loop!

1 0 0 0
0 1 0 0
0 0 1 0
0 0 0 1

- Print this two dimensional array to the output
*/
