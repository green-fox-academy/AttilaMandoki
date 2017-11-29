import java.util.Scanner;

public class drawTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive, whole number:");

        int x = input.nextInt();

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                    System.out.print("\n");
            }

    }
}
/*
Write a program that reads a number from the standard input, then draws a
triangle like this:

*
**
***
****

The triangle should have as many lines as the number was
*/