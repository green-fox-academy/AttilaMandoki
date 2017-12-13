public class Plants {

  String color;
  Float waterLevel;
  Boolean needingWater;

  public Plants(String color, Float waterLevel, Boolean needingWater) {
    this.color = color;
    this.waterLevel = waterLevel;
    this.needingWater = needingWater;

  }

  public Plants() {
    this.color = "green";
    this.waterLevel = null;
    this.needingWater = true;

  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Float getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(Float waterLevel) {
    this.waterLevel = waterLevel;
  }

  public Boolean getNeedingWater() {
    return needingWater;
  }

  public void setNeedingWater(Boolean needingWater) {
    this.needingWater = needingWater;
  }
}
