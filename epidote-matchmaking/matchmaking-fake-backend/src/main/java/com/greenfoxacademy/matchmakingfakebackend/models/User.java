package com.greenfoxacademy.matchmakingfakebackend.models;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User {

  @Id
  protected String id;
  @Column(nullable = false)
  protected String email;
  protected String phoneNumber;
  protected boolean isActiveUser;
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  protected List<Preference> preferences;

  public User() {
    this.id = UUID.randomUUID().toString();
  }

  public User(String email) {
    this.id = UUID.randomUUID().toString();
    this.email = email;
  }

  public User(String email, String phoneNumber) {
    this.id = UUID.randomUUID().toString();
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public String getId() {
    return this.id;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public boolean isActiveUser() {
    return isActiveUser;
  }

  public void setActiveUser(boolean activeUser) {
    this.isActiveUser = activeUser;
  }

  public List<Preference> getPreferences() {
    return preferences;
  }

  public void setPreferences(List<Preference> preferences) {
    this.preferences = preferences;
  }
}
