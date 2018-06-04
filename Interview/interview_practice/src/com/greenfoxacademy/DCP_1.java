package com.greenfoxacademy;

import java.util.Arrays;

public class DCP_1 {

  public boolean hasArrayTwoCandidates(int A[], int arr_size, int sum) {
    int l, r;
    Arrays.sort(A);

    l = 0;
    r = arr_size - 1;
    while (l < r) {
      if (A[l] + A[r] == sum)
        return true;
      else if (A[l] + A[r] < sum)
        l++;
      else // A[i] + A[j] > sum
        r--;
    }
    return false;
  }
}
/*Given a list of numbers, return whether any two sums to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?*/