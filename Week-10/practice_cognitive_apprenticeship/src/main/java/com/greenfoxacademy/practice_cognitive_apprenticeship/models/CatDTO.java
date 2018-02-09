package com.greenfoxacademy.practice_cognitive_apprenticeship.models;

public class CatDTO {
  private String name;
  private String breed;
  private String owner;

  public CatDTO() {
  }

  public CatDTO(String name, String breed, String owner) {
    this.name = name;
    this.breed = breed;
    this.owner = owner;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }
}
