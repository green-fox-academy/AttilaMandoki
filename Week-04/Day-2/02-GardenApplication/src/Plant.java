public class Plant {
  private String color;
  private static Double currentWaterLevel;
  private static int minWaterLevel;
  private Boolean needingWater;
  public static double waterConsumption;

  public Plant(String color, Double currentWaterLevel, int minWaterLevel, Boolean needingWater, Double waterConsumption) {
    this.color = color;
    this.currentWaterLevel = currentWaterLevel;
    this.minWaterLevel = minWaterLevel;
    this.needingWater = needingWater;
    this.waterConsumption = waterConsumption;

  }

  public Plant() {
    this.color = "";
    this.currentWaterLevel = null;
    this.minWaterLevel = 0;
    this.needingWater = true;
    this.waterConsumption = 0.0;

  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public static int getMinWaterLevel() {
    return minWaterLevel;
  }

  public void setMinWaterLevel(int minWaterLevel) {
    this.minWaterLevel = minWaterLevel;
  }

  public static Double getCurrentWaterLevel() {
    return currentWaterLevel;
  }

  public void setCurrentWaterLevel(Double currentWaterLevel) {
    this.currentWaterLevel = currentWaterLevel;
  }

  public Boolean getNeedingWater() {
    return needingWater;
  }

  public double getWaterConsumption() {
    return waterConsumption;
  }

  public void setWaterConsumption(double waterConsumption) {
    this.waterConsumption = waterConsumption;
  }

  public void setNeedingWater(Boolean needingWater) {
    this.needingWater = needingWater;

  }

  public String getStatus() {
    return getColor() + ", " + getCurrentWaterLevel() + ", " + getNeedingWater();
  }

  public boolean needingWater() {
    int minWaterLevel = 0;
    if (getCurrentWaterLevel() < minWaterLevel) {
      setNeedingWater(true);
    } else {
      setNeedingWater(false);
    }
    return needingWater();
  }

  public static void firstWatering() {
    int firstWatering = 40;
    if (getCurrentWaterLevel() < getMinWaterLevel()) {
      currentWaterLevel = currentWaterLevel + (firstWatering * waterConsumption);
    }
  }

  public void secondWatering() {
    int secondWatering = 70;
    if (getCurrentWaterLevel() < getMinWaterLevel()) {
      currentWaterLevel = currentWaterLevel + secondWatering * waterConsumption;
    }
  }
}
