public class SumDigit {
  public static void main(String[] args) {
    int n = 1 + (int)(Math.random() * ((1000 - 1) + 1));
    System.out.println(n);
    System.out.print(summing(n));
  }

  public static int summing(int number) {
    int sum = number % 10;

    if(number / 10 < 10) {
        return sum + number / 10;
    } else {
        return sum + summing(number / 10);
    }
  }
}


// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).