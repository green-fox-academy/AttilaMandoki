package com.greenfoxacademy.matchmakingfakebackend.models;

import javax.persistence.*;

@Entity
@Table(name = "preference")
public class Preference {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private int ranking;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
  private String selectionId;

  public Preference() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public String getSelectionId() {
    return selectionId;
  }

  public void setSelectionId(String selectionId) {
    this.selectionId = selectionId;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public int getRanking() {
    return ranking;
  }

  public void setRanking(int ranking) {
    this.ranking = ranking;
  }
}

