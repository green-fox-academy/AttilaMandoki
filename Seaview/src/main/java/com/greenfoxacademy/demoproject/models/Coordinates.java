package com.greenfoxacademy.demoproject.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Embeddable
public class Coordinates {

  private String lat;
  private String lng;
  private String coordinates = lat + lng;
}
