import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Please enter a positive, whole number:");

        int userInput = number.nextInt();

        factorial(userInput);


    }

    public static int factorial(int userInput) {

        for (int f = 2; f <= userInput; f++) {
            userInput *= f;
        }
        return userInput;
    }
}
