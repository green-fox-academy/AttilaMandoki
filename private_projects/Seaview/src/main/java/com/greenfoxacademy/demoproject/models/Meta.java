package com.greenfoxacademy.demoproject.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embedded;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta {

  private Long dailyQuota;
  private Long requestCount;
  private String lat;
  private String lng;
  private String coordinates = lat + lng;
}
