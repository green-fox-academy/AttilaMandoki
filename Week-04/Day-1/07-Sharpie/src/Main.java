public class Main {

  public static void main(String[] args) {

    Sharpie sharpie1 = new Sharpie("Black", (float) 0.5, 100);
    sharpie1.draw();
    System.out.println(sharpie1.toString());
    Sharpie sharpie2 = new Sharpie("Blue", (float) 0.3,  100);
    sharpie2.write();
    System.out.println(sharpie2.toString());
  }
}
