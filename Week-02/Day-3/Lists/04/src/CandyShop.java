import java.util.*;

public class CandyShop{
  public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    /*Accidentally we added "2" and "false" to the list.
    Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
    No, don't just remove the lines*/

    for (int i = 0; i < arrayList.size(); i++) {
      arrayList.set(1, "Croissant");
      arrayList.set(3, "Ice cream");
    }
    System.out.println(arrayList);
  }

}
