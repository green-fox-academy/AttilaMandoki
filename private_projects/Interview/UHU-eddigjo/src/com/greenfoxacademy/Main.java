package com.greenfoxacademy;

public class Main {
  public static void main(String[] args) {

    System.out.println(reversedHash(3552907293224L));
  }

  private static String reversedHash(long hashCode) {
    StringBuilder result = new StringBuilder(0);
    String letters = "acdegijmnoprstuw";
    int index = 0;
    while (hashCode > 558) {
      if (hashCode % 43 == 0) {
        result.append(letters.charAt(index));
        index = 0;
        hashCode /= 43;
      } else {
        hashCode -= 1;
        index += 1;
      }
    }
    return result.reverse().toString();
  }
}
