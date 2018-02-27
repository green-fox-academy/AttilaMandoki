package com.greenfoxacademy.matchmakingfakebackend.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  protected int id;
  @Column(nullable = false)
  protected String email;
  @Column(name = "phone_number")
  protected String phoneNumber;
  @Column(name = "is_active_user")
  protected boolean isActiveUser;
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  protected List<Preference> preferences;

  public User() {
  }

  public User(String email) {
    this.email = email;
  }


  public User(String email, String phoneNumber) {
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public User(int id, String email, String phoneNumber, boolean isActiveUser, List<Preference> preferences) {
    this.id = id;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.isActiveUser = isActiveUser;
    this.preferences = preferences;
  }

  public int getId() {
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
