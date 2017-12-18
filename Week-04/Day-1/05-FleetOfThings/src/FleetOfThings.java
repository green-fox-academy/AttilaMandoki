public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    Thing firstThing = new Thing("Get milk");
    fleet.add(firstThing);
    Thing secondThing = new Thing("Remove the obstacles");
    fleet.add(secondThing);
    Thing thirdThing = new Thing("Stand up");
    fleet.add(thirdThing);
    Thing fourthThing = new Thing("Eat Lunch");
    fleet.add(fourthThing);

    thirdThing.complete();
    fourthThing.complete();

    System.out.println(fleet);
  }
}