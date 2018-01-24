package com.greenfoxacademy.rest_backend_exercises.Model;

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