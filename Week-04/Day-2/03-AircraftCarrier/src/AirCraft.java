public class AirCraft {

  protected int maxAmmo;
  protected int currentAmmo;
  protected int baseDamage;
  protected String type;
  protected int allDamage;

  public AirCraft(int currentAmmo, int maxAmmo, int baseDamage, String type) {
    this.currentAmmo = currentAmmo;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.type = type;
    this.allDamage = allDamage;
  }

  public AirCraft() {
    currentAmmo = 0;
    maxAmmo = 0;
    baseDamage = 0;
    type = "";
    allDamage = fight();
  }

  public String getType() {
    return type;
  }

  public int refill(int fill) {
    if (currentAmmo == 0) {
      currentAmmo = maxAmmo;
    }
    int remainingAmmo = fill - currentAmmo;
    return remainingAmmo;
  }

  public int fight() {
    int damage = baseDamage * maxAmmo;
    currentAmmo = 0;
    return damage;
  }

  public String getStatus() {
    return ("Type: " + type + ", Ammo: " + currentAmmo + ", Base damage: " + baseDamage + ", All damage: " + fight());
  }
}
