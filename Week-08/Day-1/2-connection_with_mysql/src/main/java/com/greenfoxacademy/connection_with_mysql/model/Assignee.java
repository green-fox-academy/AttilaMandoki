package com.greenfoxacademy.connection_with_mysql.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "assignee")
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int assignee_id;
  private String name;
  private String email;

  @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER, mappedBy = "assignee_id")
  private List<Todo> todos;
}
