public class Trees extends Plants{
  float waterConsumption;

  public Trees(String name, String color, Float waterLevel, Boolean needingWater, Float waterConsumption) {
    super(color, waterLevel, needingWater);
    this.waterConsumption = (float) 0.4;



  }
}
