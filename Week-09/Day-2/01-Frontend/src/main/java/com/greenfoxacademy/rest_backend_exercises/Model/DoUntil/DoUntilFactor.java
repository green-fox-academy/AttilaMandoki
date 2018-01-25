package com.greenfoxacademy.rest_backend_exercises.Model.DoUntil;

public class DoUntilFactor {

  private int result;

  public DoUntilFactor() {

  }

  public DoUntilFactor(int result) {
    this.result = repeatingCycle(result);
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  private int repeatingCycle(int temp) {
    if (temp == 1) {
      return 1;
    } else {
      return repeatingCycle(temp - 1);
    }
  }
}
