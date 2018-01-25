package com.greenfoxacademy.recipe_book.model;

import javax.persistence.*;

@Entity
@Table(name = "recipes")
public class Recipe {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private int servings;
  private long ingredientAmount;
  private String ingredientMeasure;
  private String fullDescription;

  @OneToOne(fetch = FetchType.EAGER)
  private Author author;

  public Recipe() {
  }

  public Recipe(int servings, long ingredientAmount, String ingredientMeasure, String fullDescription) {
    this.servings = servings;
    this.ingredientAmount = ingredientAmount;
    this.ingredientMeasure = ingredientMeasure;
    this.fullDescription = fullDescription;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getServings() {
    return servings;
  }

  public void setServings(int servings) {
    this.servings = servings;
  }

  public long getIngredientAmount() {
    return ingredientAmount;
  }

  public void setIngredientAmount(long ingredientAmount) {
    this.ingredientAmount = ingredientAmount;
  }

  public String getIngredientMeasure() {
    return ingredientMeasure;
  }

  public void setIngredientMeasure(String ingredientMeasure) {
    this.ingredientMeasure = ingredientMeasure;
  }

  public String getFullDescription() {
    return fullDescription;
  }

  public void setFullDescription(String fullDescription) {
    this.fullDescription = fullDescription;
  }
}
