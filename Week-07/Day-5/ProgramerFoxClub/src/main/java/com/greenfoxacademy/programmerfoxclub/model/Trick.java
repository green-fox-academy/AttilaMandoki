package com.greenfoxacademy.programmerfoxclub.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trick {

  private List<String> trickList = new ArrayList<>(Arrays.asList("brew coffee", "play drums", "code in Java"));

  public List<String> getTrickList() {
    return trickList;
  }
}
