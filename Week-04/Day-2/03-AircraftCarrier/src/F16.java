public class F16 extends AirCraft {

  public F16(int currentAmmo, int maxAmmo, int baseDamage, String type) {
    super(currentAmmo, maxAmmo, baseDamage, type);

  }

   F16() {
    currentAmmo = 0;
    maxAmmo = 8;
    baseDamage = 30;
    type = "F16";
  }
}
