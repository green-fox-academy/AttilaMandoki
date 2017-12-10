import java.util.ArrayList;
import java.util.List;

public class Tree {
  String type;
  String leafColor;
  int age;
  char sex;

  public Tree(String type, String leafColor, int age, char sex) {
    super();
    this.type = type;
    this.leafColor = leafColor;
    this.age = age;
    this.sex = sex;

    List<Tree> myTrees = new ArrayList(5);

    Tree maple = new Tree("Large", "Red", 126, 'F');
    Tree pine = new Tree("Medium", "Dark green", 43, 'M');
    Tree oak = new Tree("Large", "Green", 209, 'F');
    Tree ebony = new Tree("Medium", "Green", 96, 'F');
    Tree bonsai = new Tree("Small", "Light green", 463, 'M');

    myTrees.add(maple);
    myTrees.add(pine);
    myTrees.add(oak);
    myTrees.add(ebony);
    myTrees.add(bonsai);
  }

  public static void main(String[] args) {

  }
}


/*
Create 5 trees
Store the data of them in variables in your program
for every tree the program should store its'
type
leaf color
age
sex
you can use just variables, or lists and/or maps
 */