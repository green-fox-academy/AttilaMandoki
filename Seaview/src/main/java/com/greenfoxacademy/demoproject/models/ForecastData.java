package com.greenfoxacademy.demoproject.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastData {

  private String source;
  private Time time;
  private Long swellHeight;
  private Long swellDirection;
  private Long swellPeriod;
  private Long waveHeight;
  private Long waveDirection;
  private Long wavePeriod;
  private Long waterTemperature;
  private Long windSpeed;
  private Long windDirection;
  private Long windGust;
  //windGust is in m/s (might have to change data type)
  private Long airTemperature;
  private Long airPressure;
  private Long humidity;
  private Long cloudCover;
  private Long precipitation;
  private Long visiblity;
  private Long dailyQuota;
  private Long latitude;
  private Long longitude;
  private Long requestCount;
  private List<ForecastData> forecastDataList = new ArrayList();
}
