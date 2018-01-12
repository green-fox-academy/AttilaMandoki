package com.greenfoxacademy.programmerfoxclub.service;


import com.greenfoxacademy.programmerfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

  private List<Fox> foxes;

  public FoxService() {
    foxes = new ArrayList<>();
  }

  public Fox login(Fox fox) {
    if (!foxes.contains(fox)) {
      foxes.add(fox);
    }
    return fox;
  }
}
