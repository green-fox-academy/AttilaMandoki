public class Pirate {

  public static final int MAX_RUM = 4;
  public static final String soberSpeech = "Pour me anudder";
  public static final String drunkSpeech = "Arghh, I'ma Pirate. How d'ya d'ink its goin'?";
  public static final String deadPirate = "He is dead!";
  public static final String unconsciousPirate = "He passed out!";

  private static int rumLevel;

  private static boolean pirateIsDead;
  private static boolean pirateIsPassedOut;

  public static void drinkSomeRum() {
    if (pirateIsDead) {
      System.out.println(deadPirate);
      return;
    }
    if (++rumLevel > MAX_RUM) {
      pirateIsPassedOut = true;
    }
  }

  String howsItGoingMate() {
    if (pirateIsDead) {
      return deadPirate;
    }
    if (pirateIsPassedOut) {
      return unconsciousPirate;
    }
    if (rumLevel <= MAX_RUM) {
      return soberSpeech;
    } else {
      return drunkSpeech;
    }
  }

  public static void theDeathOfAPirate() {
    if (pirateIsDead) {
      System.out.println(deadPirate);
      return;
    }
    pirateIsDead = true;
  }

  public static void brawl() {
        
  }
}

/*
drinkSomeRum() - intoxicates the Pirate some
howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
0 to 4 times, "Pour me anudder!"
else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.

die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance,
1 dies, the other dies or they both pass out.
And... if you get that far...

Add a parrot.
*/
