import java.util.ArrayList;

public class Garden {
  public static void main(String[] args) {
    ArrayList<Plants> allPlants = new ArrayList<>();

    Plants yellow = new Flowers("Yellow", 0.0, true, 0.75);
    allPlants.add(yellow);
    Plants blue = new Flowers("Blue", 0.0, true, 0.75);
    allPlants.add(blue);
    Plants purple = new Trees("Purple", 0.0, true, 0.4);
    allPlants.add(purple);
    Plants orange = new Trees("Orange", 0.0, true, 0.4);
    allPlants.add(orange);

      
    }
  }
}