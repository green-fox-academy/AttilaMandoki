public class Tree extends Plant {

  public Tree(String color, Double waterLevel, int minWaterLevel, Boolean needingWater, Double waterConsumption) {
    super(color, waterLevel, minWaterLevel, needingWater, waterConsumption);
  }

  public Tree() {
    this.setColor(getColor());
    this.setNeedingWater(true);
    this.setMinWaterLevel(10);
    this.setCurrentWaterLevel(0.0);
    this.waterConsumption = 0.4;
  }
}
