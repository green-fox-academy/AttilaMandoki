public class AirCraft {

  protected int maxAmmo;
  protected int currentAmmo;
  protected int baseDamage;
  protected String type;
  protected int allDamage;

   AirCraft(int currentAmmo, int maxAmmo, int baseDamage, String type) {
    this.currentAmmo = currentAmmo;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.type = type;
    this.allDamage = allDamage;
  }

   AirCraft() {
    currentAmmo = 0;
    maxAmmo = 0;
    baseDamage = 0;
    type = "";
    allDamage = fight();
  }

  public String getType() {
    return type;
  }

  int refill(int fill) {
    if (currentAmmo == 0) {
      currentAmmo = maxAmmo;
    }
    return fill - currentAmmo;
  }

   int fight() {
    int damage = baseDamage * maxAmmo;
    currentAmmo = 0;
    return damage;
  }

   String getStatus() {
    return ("Type: " + type + ", Ammo: " + currentAmmo + ", Base damage: " + baseDamage + ", All damage: " + fight());
  }
}
