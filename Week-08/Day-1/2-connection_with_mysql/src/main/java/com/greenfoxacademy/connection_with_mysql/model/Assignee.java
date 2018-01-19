package com.greenfoxacademy.connection_with_mysql.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "assignee")
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int assignee_id;
  private String name;
  private String email;

  @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER, mappedBy = "id")
  private List<Todo> todos;

  public Assignee() {
    this.todos = new ArrayList<>();
  }

  public Assignee(String name, String email, List<Todo> todos) {
    this.name = name;
    this.email = email;
    this.todos = todos;
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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
