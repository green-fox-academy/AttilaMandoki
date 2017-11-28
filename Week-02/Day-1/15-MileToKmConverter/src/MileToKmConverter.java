import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner Km = new Scanner(System.in);

        double userInput = Km.nextDouble();

        System.out.println(userInput * 0.62137);


        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
    }
}