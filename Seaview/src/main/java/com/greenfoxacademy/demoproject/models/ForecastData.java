package com.greenfoxacademy.demoproject.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastData {

  private String source;
  private Time time;
  private Long waveHeight;
  private Long waveDirection;
  private Long waterTemperature;
  private Long windSpeed;
  private Long windDirection;
  private Long airTemperature;
  private Long precipitation;
  private Long visibility;
}
