package com.greenfoxacademy.pallidaorientationexam.Models;

public class CarList {

  private String result;
  private Iterable<Car> data;

  public CarList() {
  }

  public CarList(String result, Iterable<Car> data) {
    this.result = result;
    this.data = data;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public Iterable<Car> getData() {
    return data;
  }

  public void setData(Iterable<Car> data) {
    this.data = data;
  }
}
