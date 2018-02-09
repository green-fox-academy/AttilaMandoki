package com.greenfoxacademy.practice_cognitive_apprenticeship.models;

public class OwnerDTO {
  private String name;

  public OwnerDTO() {
  }

  public OwnerDTO(String name) {
    this.name = name;
    }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
