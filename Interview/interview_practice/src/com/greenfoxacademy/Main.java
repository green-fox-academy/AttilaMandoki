package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {
    DCP_1 dcp_1 = new DCP_1();

    int A[] = {1, 4, 45, 6, 10, -8};
    int n = 3;
    int arr_size = A.length;

    if (dcp_1.hasArrayTwoCandidates(A, arr_size, n))
      System.out.println("Array has two elements with given sum");
    else
      System.out.println("Array doesn't have two elements with given sum");

    //---------------------------------------------------------------------


  }
}

