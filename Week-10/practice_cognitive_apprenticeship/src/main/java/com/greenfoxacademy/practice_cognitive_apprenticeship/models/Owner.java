package com.greenfoxacademy.practice_cognitive_apprenticeship.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Owner {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "owner_name")
  private String ownerName;

  @JsonIgnore
  @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
  private List<Cat> cats;

  public Owner() {
  }

  public Owner(String ownerName) {
    this.ownerName = ownerName;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public List<Cat> getCats() {
    return cats;
  }

  public void setCats(List<Cat> cats) {
    this.cats = cats;
  }
}
