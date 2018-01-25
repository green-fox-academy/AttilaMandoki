package com.greenfoxacademy.rest_backend_exercises.Model;

public class AppendA implements MainModel {

  private String appendable;
  private String appended;

  public AppendA() {
  }

  public AppendA(String appendable, String appended) {
    this.appendable = appendable;
    this.appended = appendable + "a";

  }

  public String getAppendable() {
    return appendable;
  }

  public void setAppendable(String appendable) {
    this.appendable = appendable;
  }

  public String getAppended() {
    return appended;
  }
}
