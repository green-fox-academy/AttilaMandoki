public class Main {

  public static void main(String[] args) {

    AirCraft falcon = new F16();

    System.out.println(falcon.refill(25));
    System.out.println(falcon.fight());
    System.out.println(falcon.maxAmmo);
    System.out.println(falcon.currentAmmo);
    System.out.println(falcon.refill(17));
    System.out.println(falcon.currentAmmo);
    System.out.println(falcon.getStatus());

    AirCraft lightningII = new F35();

    System.out.println(lightningII.refill(43));
    System.out.println(lightningII.fight());
    System.out.println(lightningII.maxAmmo);
    System.out.println(lightningII.currentAmmo);
    System.out.println(lightningII.refill(31));
    System.out.println(lightningII.currentAmmo);
    System.out.println(lightningII.getStatus());

  }
}
