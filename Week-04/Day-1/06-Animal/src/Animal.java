public class Animal {

    int hunger = 50;
    int thirst = 50;
    String name = "Lion";

  public Animal(){
    this(50, 50);
  }

  public Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public void eat() {
    hunger -= 1;
  }

  public void drink() {
    thirst -= 1;
  }

  public void play() {
    hunger += 1;
    thirst += 1;
  }

  @Override
  public String toString() {
    return "The " + name + "'s" +
            " hunger is " + hunger +
            " and it's thirst is " + thirst + ".";
  }
}