import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        Scanner numberOfGirls = new Scanner(System.in);
        int userInput1 = numberOfGirls.nextInt();

        Scanner numberOfBoys = new Scanner(System.in);
        int userInput2 = numberOfBoys.nextInt();

        if (((userInput1 % userInput2) == 1) && ((userInput1 + userInput2) > 20)) {
            System.out.println("Excellent party!");
        } else if ((userInput1 % userInput2) != 1) && ((userInput1 + userInput2) > 20) {
            System.out.println("Quite good party!");
        } else if ((userInput1 + userInput2) < 20) {
            System.out.println("Average party...");
        } else (userInput1 == 0) {
            System.out.println("Sausage party.");
        }

    }
}

/*
Write a program that asks for two numbers
Thw first number represents the number of girls that comes to a party, the
second the boys
It should print: The party is excellent!
If the the number of girls and boys are equal and there are more people coming than 20

It should print: Quite cool party!
It there are more than 20 people coming but the girl - boy ratio is not 1-1

It should print: Average party...
If there are less people coming than 20

It should print: Sausage party
If no girls are coming, regardless the count of the people
*/
