import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

  public static void main(String[] args) {

    System.out.println("Please enter a range of numbers:");

    Scanner scanner1 = new Scanner(System.in);
    int minimumNumber = scanner1.nextInt();

    Scanner scanner2 = new Scanner(System.in);
    int maximumNumber = scanner2.nextInt();

    System.out.println(randomInt(minimumNumber, maximumNumber));

    listChecker(listBuilder(minimumNumber, maximumNumber), randomInt(minimumNumber, maximumNumber));
  }

  private static Integer randomInt(int min, int max) {
    Random rand = new Random();

    return rand.nextInt((max - min) + 1) + min;
  }

  private static ArrayList<Integer> listBuilder(int lowNum, int highNum) {
    ArrayList<Integer> listBetweenTwoNumbers = new ArrayList<>();
    for (int i = lowNum + 1; i <= highNum; i++) {
      listBetweenTwoNumbers.add(i, i + 1);
    }
    return listBetweenTwoNumbers;
  }

  private static void listChecker(ArrayList<Integer> listToCheck, int randomized) {
    for (Integer aListToCheck : listToCheck) {
      if (aListToCheck.equals(randomized)) {
        System.out.println("We have a winner!");
        break;
      } else if (aListToCheck < randomized) {
        System.out.println("Aim higher.");
      } else if (aListToCheck > randomized) {
        System.out.println("Too high, I'm afraid.");
      }
    }
  }
}

/*
Write a program where the program chooses a number between 1 and 100.
The player is then asked to enter a guess. If the player guesses wrong,
then the program gives feedback and ask to enter an other guess until the guess is correct.

Make the range customizable (ask for it before starting the guessing).
You can add lives. (optional)
*/
