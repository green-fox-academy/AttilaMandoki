public class Main {

  public static void main(String[] args) {

    Station omw = new Station();
    Car mazda = new Car();

    omw.refill(mazda);
    System.out.println(mazda.getCarGasAmount());
    System.out.println(omw.getStationGasAmount());
  }
}
