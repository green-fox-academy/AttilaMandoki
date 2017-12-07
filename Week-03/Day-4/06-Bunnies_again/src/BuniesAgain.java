public class BuniesAgain {
  public static void main(String[] args) {
    int mutantBunnyArmy = (int) (Math.random() * (100 - 1) + 1);
    System.out.println(mutantBunnyArmy);
    System.out.println(earCounter(mutantBunnyArmy));

  }
  public static int earCounter(int bunnyRow) {
    if (bunnyRow == 0) {
      return 0;
    }
    else if (bunnyRow % 2 == 0) {
      return 2 + earCounter(bunnyRow - 1);
    } else {
        return 3 + earCounter(bunnyRow - 1);
    }
  }
}

// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).