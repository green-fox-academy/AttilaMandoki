package com.greenfoxacademy.connection_with_mysql.model;

import javax.persistence.Entity;


@Entity
public class Assignee {

  private int assigneeID;
  private String name;
  private String email;

  public int getAssigneeID() {
    return assigneeID;
  }

  public void setAssigneeID(int assigneeID) {
    this.assigneeID = assigneeID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
