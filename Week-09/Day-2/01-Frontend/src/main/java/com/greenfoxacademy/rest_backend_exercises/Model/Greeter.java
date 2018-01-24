package com.greenfoxacademy.rest_backend_exercises.Model;

public class Greeter implements MainModel {

  private String name;
  private String title;
  private String message;

  public Greeter() {
  }

  public Greeter(String name, String title) {
    this.name = name;
    this.title = title;
    this.message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
