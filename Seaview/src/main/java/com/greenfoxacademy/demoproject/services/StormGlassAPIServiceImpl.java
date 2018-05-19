package com.greenfoxacademy.demoproject.services;

import com.greenfoxacademy.demoproject.models.ForecastData;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import retrofit2.Call;

@Service
public class StormGlassAPIServiceImpl implements StormGlassAPIService {

  //private static final Logger LOGGER = new LoggerFactory.getLogger(StormGlassAPIServiceImpl.class);

  private static final String TOKEN = System.getenv("API_KEY");

  @Override
  public Call<ForecastData> getForecastData(String data) {
    return null;
  }
}
