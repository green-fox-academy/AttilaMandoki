public class Domino implements Printable {
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[f: " + values[0] + ", s: " + values[1] + "]";
  }

  @Override
  public void printAllFields() {
    System.out.println(toString());
  }
}