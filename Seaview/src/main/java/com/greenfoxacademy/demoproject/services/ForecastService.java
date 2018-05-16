package com.greenfoxacademy.demoproject.services;

import com.greenfoxacademy.demoproject.Repositories.ForecastRepo;
import com.greenfoxacademy.demoproject.models.ForecastData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class ForecastService {

  private String token = System.getenv("API_KEY");

  private final ForecastRepo forecastRepo;

  @Autowired
  public ForecastService(ForecastRepo forecastRepo) {
    this.forecastRepo = forecastRepo;
  }

  public ArrayList<ForecastData> forecastDataList(double longitude, double latitude) {

  }
}