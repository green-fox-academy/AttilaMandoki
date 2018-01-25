package com.greenfoxacademy.rest_backend_exercises.Model.Message;

import com.greenfoxacademy.rest_backend_exercises.Model.MainModel;

public class ErrorMessage implements MainModel {
  String error;

  public ErrorMessage(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}