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
  private double swellHeight;
  private double swellDirection;
  private double swellPeriod;
  private double waveHeight;
  private double waveDirection;
  private double wavePeriod;
  private double waterTemperature;
  private double windSpeed;
  private double windDirection;
  private double windGust;
  //windGust is in m/s (might have to change data type)
  private double airTemperature;
  private double airPressure;
  private double humidity;
  private double cloudCover;
  private double precipitation;
  private double visiblity;
  private double dailyQuota;
  private double latitude;
  private double longitude;
  private double requestCount;
}
