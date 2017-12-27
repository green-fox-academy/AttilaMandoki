public class Station {
  private int stationGasAmount;

  public Station() {
    this.stationGasAmount = 1000;
  }

  public Station(int stationGasAmount) {
    this.stationGasAmount = stationGasAmount;
  }

  public int getStationGasAmount() {
    return stationGasAmount;
  }

  public void refill(Car car) {
    stationGasAmount -= (car.getCapacity() - car.getCarGasAmount());
    car.setCarGasAmount(car.getCarGasAmount() + (car.getCapacity() - car.getCarGasAmount()));
  }
}

/*
Create Station and Car classes
Station
stationGasAmount
refill(car) -> decreases the stationGasAmount by the capacity of the car and increases the cars stationGasAmount
*/