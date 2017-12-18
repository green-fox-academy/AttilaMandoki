public class Flower extends Plant {
  double waterConsumption;

  public Flower(String color, Double waterLevel, Boolean needingWater, Double waterConsumption) {
    super(color, waterLevel, needingWater);
    this.waterConsumption = 0.75;

  }

  public Flower() {
    this.waterConsumption = 0.75;
    this.setColor(getColor());
    this.setNeedingWater(true);
    this.setWaterLevel(0.0);

  }

  public Double getWaterConsumption() {
    return waterConsumption;
  }

  public void setWaterConsumption(Double waterConsumption) {
    this.waterConsumption = waterConsumption;

  }

  public boolean needingWater() {
    if (getWaterLevel() < 5) {
      setNeedingWater(true);
    } else {
      setNeedingWater(false);
    }
    return needingWater();
  }
}