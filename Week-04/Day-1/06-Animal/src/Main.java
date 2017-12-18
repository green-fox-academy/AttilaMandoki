public class Main {

  public static void main(String[] args) {

    Animal lion = new Animal();
    lion.eat();
    lion.drink();
    System.out.println(lion.toString());
    lion.play();
    System.out.println(lion.toString());
  }
}
