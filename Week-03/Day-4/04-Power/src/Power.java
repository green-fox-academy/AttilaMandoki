public class Power {
  public static void main(String[] args) {
    int base = (int)(Math.random() * (10 - 1)+1);
    int n = (int)(Math.random() * (10 - 1)+1);
    System.out.println(base);
    System.out.println(n);
    System.out.println(pwr(base, n));


  }
  public static int pwr(int base, int n) {
    if (n == 1) {
      return base;
    } else {
      return ( base * pwr(base,n-1));
    }
  }
}


// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).