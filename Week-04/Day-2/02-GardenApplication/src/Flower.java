public class Flower extends Plant {

  public Flower(String color, Double waterLevel, int minWaterLevel, Boolean needingWater, Double waterConsumption) {
    super(color, waterLevel, minWaterLevel, needingWater, waterConsumption);
  }

  public Flower() {
    this.setColor(getColor());
    this.setNeedingWater(true);
    this.setMinWaterLevel(5);
    this.setCurrentWaterLevel(0.0);
    this.waterConsumption = 0.75;
  }
}
