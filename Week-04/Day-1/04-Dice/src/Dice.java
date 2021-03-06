import java.util.Arrays;

public class Dice {
//    You have a Dice class which has 6 dice
//    You can roll all of them with roll()
//    Check the current rolled numbers with getCurrent()
//    You can reroll with reroll()
//    Your task is to get where all dice is a 6

  int[] dices = new int[6];

  public static void main(String[] args) {
    Dice luckyDice = new Dice();
    luckyDice.roll();

    for (int i = 0; i < luckyDice.dices.length; i++) {
      while (luckyDice.getCurrent(i) != 6) {
        luckyDice.reRoll(i);
        System.out.println(Arrays.toString(luckyDice.dices));
      }
    }
    System.out.println(Arrays.toString(luckyDice.dices));

    Dice myDice = new Dice();
    myDice.getCurrent();
    myDice.roll();
    myDice.getCurrent();
    myDice.getCurrent(5);
    myDice.reRoll();
    myDice.getCurrent();
    myDice.reRoll(4);
    myDice.getCurrent();

    System.out.println(myDice.dices.toString());

  }

  private int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reRoll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reRoll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }
}
