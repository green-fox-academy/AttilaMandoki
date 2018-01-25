package com.greenfoxacademy.rest_backend_exercises.Model.DoUntil;

import com.greenfoxacademy.rest_backend_exercises.Model.MainModel;

public class DoUntilSum implements MainModel {

  private int inputUntil;
  private int result;

  public DoUntilSum(int inputUntil, int result) {
    this.inputUntil = inputUntil;
    this.result = result * (result - 1) / 2;
  }

  public DoUntilSum() {

  }

  public int getInputUntil() {
    return inputUntil;
  }

  public void setInputUntil(int inputUntil) {
    this.inputUntil = inputUntil;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
