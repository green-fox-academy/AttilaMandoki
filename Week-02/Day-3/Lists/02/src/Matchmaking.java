import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
    ArrayList<String> order = new ArrayList<>();

    int combinedSize = Math.max(girls.size(), boys.size());

    for (int i = 0; i < combinedSize; i++) {
      if (i < girls.size()) {
        order.add(girls.get(i));
        if (i < boys.size()) {
          order.add(boys.get(i));
        }
      }
    }


    // Join the two lists by matching one girl with one boy in the order list
    // Expected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(order);
  }
}