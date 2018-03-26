package com.greenfoxacademy;

import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    String firstString = "Create a function that takes two strings and returns an array of";
    String secondString = "characters that consists all the common letters of the two arrays";

    String commonLetters = findCommonChars(firstString, secondString);
    char[] charArrayOfLetters = commonLetters.toCharArray();
    System.out.println(charArrayOfLetters);

  }

  private static String findCommonChars(String firstInput, String secondInput) {
    StringBuilder resultBuilder = new StringBuilder();
    Set<Character> charsMap = new HashSet<>();
    for (int i = 0; i < firstInput.length(); i++) {
      char charAt = firstInput.charAt(i);
      if (secondInput.indexOf(charAt) != -1) {
        charsMap.add(charAt);
      }
    }
    for (Character aCharsMap : charsMap) {
      resultBuilder.append(aCharsMap.charValue());
    }
    return resultBuilder.toString();
  }

}
