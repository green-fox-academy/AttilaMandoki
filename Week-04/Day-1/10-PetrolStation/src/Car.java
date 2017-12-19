public class Car {
  private int carGasAmount;
  private int capacity;

  public Car() {
    this.carGasAmount = 29;
    this.capacity = 100;

  }

  public Car(int carGasAmount, int capacity) {
    this.carGasAmount = carGasAmount;
    this.capacity = capacity;

  }

  public int getCapacity() {
    return capacity;
  }

  public int getCarGasAmount() {
    return carGasAmount;
  }

   public void setCarGasAmount(int fillUpAmount) {
    this.carGasAmount = fillUpAmount;
   }
}

/*
Car
carGasAmount
capacity
create constructor for Car where:
initialize carGasAmount -> 0
initialize capacity -> 100
*/