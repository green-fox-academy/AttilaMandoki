import java.util.ArrayList;
import java.util.List;

public class Dominoes {

  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    System.out.println(dominoes);

    pairedDominoes(dominoes);
    System.out.println(pairedDominoes(dominoes));

  }

  private static List<Domino> pairedDominoes(List<Domino> dominoList) {
    for (int i = 0; i < dominoList.size(); i++) {
      for (int j = i; j < dominoList.size(); j++) {
        if (dominoList.get(i).getValues()[1] == dominoList.get(j).getValues()[0]) {
          dominoList.add(i+1, dominoList.get(j));
          dominoList.remove(j+1);
        }
      }
    }
    return dominoList;
  }

  private static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
