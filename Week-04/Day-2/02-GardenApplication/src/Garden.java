import java.util.ArrayList;
import java.util.List;

public class Garden {

  public static void main(String[] args) {

    List<Plant> allPlants = new ArrayList<>();

    Plant yellow = new Flower("Yellow", 0.0, 5, true,0.75);
    allPlants.add(yellow);
    Plant blue = new Flower("Blue", 0.0, 5, true, 0.75);
    allPlants.add(blue);
    Plant purple = new Tree("Purple", 0.0, 10, true, 0.4);
    allPlants.add(purple);
    Plant orange = new Tree("Orange", 0.0, 10, true, 0.4);
    allPlants.add(orange);

    yellow.firstWatering();
    System.out.println(yellow.getStatus());
  }
}
