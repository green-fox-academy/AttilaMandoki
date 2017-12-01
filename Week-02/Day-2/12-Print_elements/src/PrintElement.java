public class PrintElement {
  public static void main(String[] args) {

    int[] af =new int[4];

    af[0] = 4;
    af[1] = 5;
    af[2] = 6;
    af[3] = 7;

    for (int i = 0; i < af.length; i++) {
      System.out.println(af[i]);
    }
  }
}
// - Create an array variable named `af`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `af`