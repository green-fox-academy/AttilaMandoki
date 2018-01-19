package com.greenfoxacademy.connection_with_mysql.model;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;

  @OneToOne(fetch = FetchType.EAGER)
  private Assignee assignee;

  public Todo() {
  }

  public Todo(String title, boolean isUrgent, boolean isDone, String assigneeName, String email) {
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
    this.assignee = new Assignee();
    this.assignee.setName(assigneeName);
    this.assignee.setEmail(email);
  }

  public Todo(String title) {
    this.title = title;

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

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }
}
