package com.greenfoxacademy.demoproject.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table
public class User {

  @Id
  protected String id;
  @Column(name = "user_name", nullable = false)
  private String userName;
  @Column(nullable = false)
  protected String email;

  public User() {
    this.id = UUID.randomUUID().toString();
  }

  public User(String userName, String email) {
    this.id = UUID.randomUUID().toString();
    this.userName = userName;
    this.email = email;
  }
}
