package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // Create a function that takes a list as a parameter,
    // and returns a new list with every second element from the original list
    // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result

    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));

    System.out.println(secondElements(numbers));
  }

  public static List<Integer> secondElements(List<Integer> fullList) {
    List<Integer> temporalList = new ArrayList<>();
    for (int i = 0; i < fullList.size(); i+=2) {
      if (i != 0) {
        temporalList.add(i);
      }
    }
    return temporalList;
  }
}
