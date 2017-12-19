public class Sharpie {
  String color;
  float width;
  int inkAmount = 100;

  @Override
  public String toString() {
    return "Sharpie{" +
            "color='" + color + '\'' +
            ", width=" + width +
            ", inkAmount=" + inkAmount +
            '}';
  }

  public Sharpie() {
    this("", 0, 100);
  }

  public Sharpie(String color, float width, int inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  public void draw() {
    inkAmount -= 5;
  }

  public void write() {
    inkAmount -= 3;
  }
}