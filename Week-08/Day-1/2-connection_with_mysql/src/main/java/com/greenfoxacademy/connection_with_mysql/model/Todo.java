package com.greenfoxacademy.connection_with_mysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;
  private String assignee;
  private String email;

  public Todo(String assignee, String email) {
    this.assignee = assignee;
    this.email = email;
  }

  public Todo() {
  }

  public Todo(String title, boolean isUrgent, boolean isDone, String assignee, String email) {
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
    this.assignee = assignee;
    this.email = email;
  }

  public Todo(String title) {
    this.title = title;

  }

  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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

  public boolean getIsUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean getIsDone() {
    return isDone;
  }

  public void setIsDone(boolean done) {
    isDone = done;
  }
}
