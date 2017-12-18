public class Tree extends Plant {
  Double waterConsumption;

  public Tree(String color, Double waterLevel, Boolean needingWater, Double waterConsumption) {
    super(color, waterLevel, needingWater);
    this.waterConsumption = 0.75;
  }

  public Double getWaterConsumption() {
    return waterConsumption;
  }

  public void setWaterConsumption(Double waterConsumption) {
    this.waterConsumption = waterConsumption;
  }

  public boolean checkIfItNeedsWater() {
    if (getWaterLevel() < 10) {
      return ;
    } else {
      return needsWater = false;
    }
  }
}
