public class Flowers extends Plants {
  double waterConsumption;

  public Flowers(String color, Double waterLevel, Boolean needingWater, Double waterConsumption) {
    super(color, waterLevel, needingWater);
    this.waterConsumption = 0.75;

  }

  public Flowers() {
    this.waterConsumption = 0.75;
    this.setColor(color);
    this.setNeedingWater(true);
    this.setWaterLevel(0.0);

  }

  public Double getWaterConsumption() {
    return waterConsumption;
  }

  public void setWaterConsumption(Double waterConsumption) {
    this.waterConsumption = waterConsumption;

  }

  public void needingWater() {
    if (getWaterLevel() < 10) {
      setNeedingWater(true);
    } else {
      setNeedingWater(false);
    }
  }
}