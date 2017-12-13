public class Trees extends Plants{
  Double waterConsumption;

  public Trees(String color, Double waterLevel, Boolean needingWater, Double waterConsumption) {
    super(color, waterLevel, needingWater);
    this.waterConsumption = 0.75;

  }

    public Trees() {
      this.waterConsumption = 0.4;
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
    if (getWaterLevel() < 5) {
      setNeedingWater(true);
    } else {
      setNeedingWater(false);
    }
  }
}
