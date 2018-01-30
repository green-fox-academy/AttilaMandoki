package com.greenfoxacademy.rest_backend_exercises.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class Doubling implements MainModel {
  private Integer received;
  private Integer result;

  @JsonCreator
  public Doubling(@JsonProperty("received")Integer received) {
    this.received = received;
    this.result = received * 2;
  }

  public Doubling() {
  }

  public Doubling(Integer received, Integer result) {
    this.received = received;
    this.result = result;
  }

  public Integer getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
