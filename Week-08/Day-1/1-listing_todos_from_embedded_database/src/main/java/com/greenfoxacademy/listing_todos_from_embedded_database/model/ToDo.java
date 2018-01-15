package com.greenfoxacademy.listing_todos_from_embedded_database.model;

import javax.persistence.Entity;

@Entity
public class ToDo {

  private int id;
  private String title;
  private boolean isUrgent;
  private boolean isDOne;

  public ToDo() {
  }

  public ToDo(int id, String title, boolean isUrgent, boolean isDOne) {
    this.id = id;
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDOne = isDOne;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean isDOne() {
    return isDOne;
  }

  public void setDOne(boolean DOne) {
    isDOne = DOne;
  }
}
