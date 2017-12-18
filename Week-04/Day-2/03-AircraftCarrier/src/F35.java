public class F35 extends AirCraft {

  public F35(int currentAmmo, int maxAmmo, int baseDamage, String type) {
    super(currentAmmo, maxAmmo, baseDamage, type);

  }

  public F35() {
    currentAmmo = 0;
    maxAmmo = 12;
    baseDamage = 50;
    type = "F35";
  }
}
