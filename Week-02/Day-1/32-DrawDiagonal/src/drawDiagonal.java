import java.util.Scanner;

public class drawDiagonal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive, whole number:");

        int x = input.nextInt();

        int y = 0;

        for (int i = 0; i < x; i++) {
            if (i == 0 || i == x - 1) {
                for (int j = 0; j < x; j++) {
                    System.out.print("%");
                }
            } else {

                for (int j = 0; j < x; j++) {
                    if (j == 0 || j == x - 1 || j == y) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
            y = y + 1;
        }
    }
}
/*
Write a program that reads a number from the standard input, then draws a
square like this:


%%%%%
%%  %
% % %
%  %%
%%%%%

The square should have as many lines as the number was
*/
