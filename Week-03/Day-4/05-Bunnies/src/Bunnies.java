public class Bunnies {
  public static void main(String[] args) {
    int bunnies = (int)(Math.random() * (100 - 1)+1);
    int floppyEars = 2;
    System.out.println(bunnies);
    System.out.println(earCounter(bunnies, floppyEars));

  }
  public static int earCounter(int base, int multiplier) {
    if (base == 0 || multiplier == 0) {
      return 0;
    } else {
      return base + earCounter(base, multiplier - 1);
    }
  }
}
// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).