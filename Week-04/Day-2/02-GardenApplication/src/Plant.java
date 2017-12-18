public class Plant {
  private String color;
  private Double waterLevel;
  private Boolean needingWater;

  public Plant(String color, Double waterLevel, Boolean needingWater) {
    this.color = color;
    this.waterLevel = waterLevel;
    this.needingWater = needingWater;

  }

  public Plant() {
    this.color = "";
    this.waterLevel = null;
    this.needingWater = true;

  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Double getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(Double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public Boolean getNeedingWater() {
    return needingWater;
  }

  public void setNeedingWater(Boolean needingWater) {
    this.needingWater = needingWater;
  }
}
