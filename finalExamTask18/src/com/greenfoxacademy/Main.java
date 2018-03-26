package com.greenfoxacademy;

import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    String firstString = "Create a function that takes tWo strings and returns an array of";
    String secondString = "characters that consists all the common letters of the two arrays";

    System.out.println(converter(findCommonChars(firstString, secondString)));
  }

  private static String findCommonChars(String firstInput, String secondInput) {
    StringBuilder resultBuilder = new StringBuilder();
    Set<Character> characterMap = new HashSet<>();
    for (int i = 0; i < firstInput.length(); i++) {
      char charAt = firstInput.toLowerCase().charAt(i);
      if (secondInput.toLowerCase().indexOf(charAt) != -1) {
        characterMap.add(charAt);
      }
    }
    for (Character aCharsMap : characterMap) {
      resultBuilder.append(aCharsMap.charValue());
    }
    return resultBuilder.toString();
  }

  private static char[] converter(String inputString) {
    return inputString.toCharArray();
  }

}
