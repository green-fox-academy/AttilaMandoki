package com.greenfoxacademy;

import java.util.Arrays;

public class DCP_2 {

  int[] productOfAllButI(int[] ints) {
    int y = ints.length - 1;;
    Arrays.sort(ints);

    for (int i = 0; i < y; i++) {
    }
    return null;
  }
}
/*Given an array of integers, return a new array such that each element
at index i of the new array is the product of all the numbers in the original
array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be
[120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].*/

//solution: https://www.geeksforgeeks.org/a-product-array-puzzle/