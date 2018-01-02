public class Domino implements Comparable<Domino> {
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public int compareTo(Domino domino) {
    return Integer.compare(this.getValues()[0], domino.getValues()[0]);
  }

  @Override
  public String toString() {
    return "[f: " + values[0] + ", s: " + values[1] + "]";
  }
}