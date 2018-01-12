package com.greenfoxacademy.programmerfoxclub.model;

import java.util.List;

public class Fox {

  private String name;
  private int tricksKnown;
  List<Trick> tricks;
  Drink drink;
  Food food;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getTricksKnown() {
    return tricksKnown;
  }

  public void setTricksKnown(int tricksKnown) {
    this.tricksKnown = tricksKnown;
  }

  public List<Trick> getTricks() {
    return tricks;
  }

  public void setTricks(List<Trick> tricks) {
    this.tricks = tricks;
  }

  public Drink getDrink() {
    return drink;
  }

  public void setDrink(Drink drink) {
    this.drink = drink;
  }

  public Food getFood() {
    return food;
  }

  public void setFood(Food food) {
    this.food = food;
  }

  public Fox() {
  }

}
