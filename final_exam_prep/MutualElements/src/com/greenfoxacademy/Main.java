package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // Create a method that takes two integer lists as a parameter
    // and returns an integer list with the mutual elements from the lists.
    // Write at least 3 different test cases.

    // For example:
    List<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4));
    List<Integer> b = new ArrayList<>(Arrays.asList(3, 4, 4, 5, 6));

    System.out.println(filterMutualElements(a, b));
    // Should print:
    // [3,4]
  }

  private static List<Integer> filterMutualElements(List<Integer> firstList, List<Integer> secondList) {
    List<Integer> resultList = new ArrayList<>();
    for (int i = 0; i < firstList.size(); i++) {
      for (int j = 0; j < secondList.size(); j++) {
        if (firstList.get(i).equals(secondList.get(j))) {
          resultList.add(firstList.get(i));
        }
      }
    }
    return resultList;
  }
}
