import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {

        int random = (int )(Math.random() * 20 + 1);
        // You can check if it's working by activating the line below.
        // System.out.println(random);

        Scanner guess = new Scanner(System.in);

        System.out.println("Make a guess between 1 and 20!");

        int input = guess.nextInt();

        if (input == random) {
            System.out.println("You found the number: " + random);
        } else if (input < random) {
            System.out.println("The stored number is higher.");
        } else {
            System.out.println("The stored number is lower.");
        }

    }
}
/*

Write a program that stores a number, and the user has to figure it out.
The user can input guesses, after each guess the program would tell one
of the following:

The stored number is higher
The stored number is lower
You found the number: 8
*/
