package com.greenfoxacademy.demoproject.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastData {

  private String source;
  private double swellHeight;
  private double swellDirection;
  private double swellPeriod;
  private double waveHeight;
  private double waveDirection;
  private double wavePeriod;
  private double windSpeed;
  private double windDirection;
  private double airTemperature;
}
