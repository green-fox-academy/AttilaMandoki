package com.greenfoxacademy.rest_backend_exercises.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class Doubling {
  private Integer received;
  private Integer result;

  @JsonCreator
  public Doubling(@JsonProperty("received")Integer received) {
    this.received = received;
    this.result = received * 2;
  }
}
