import java.util.ArrayList;
import java.util.List;

public class Farm {

  int freeSlotForNewAnimal;
  List<Animal> farm;

  public Farm() {
    farm = new ArrayList<>();
  }

  public void breed() {
    if (freeSlotForNewAnimal > 0) {
      new Animal();
    }
  }

  public void slaughter() {
    int wellFedAnimal = 0;
    for (int i = 0; i < farm.size() - 1; i++) {
      if (farm.get(i).hunger < farm.get(i + 1).hunger) {
        wellFedAnimal = i;
      } else {
        wellFedAnimal = i + 1;
      }
    }
    farm.remove(wellFedAnimal);
  }
}
/*
Reuse your Animal class
Create a Farm class
it has list of Animals
it has slots which defines the number of free places for animals
breed() -> creates a new animal if there's place for it
slaughter() -> removes the least hungry animal
*/