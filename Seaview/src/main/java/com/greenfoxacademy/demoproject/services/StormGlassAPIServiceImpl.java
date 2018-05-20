package com.greenfoxacademy.demoproject.services;

import com.greenfoxacademy.demoproject.models.ForecastData;
import org.springframework.stereotype.Service;
import retrofit2.Call;

import java.util.List;

@Service
public class StormGlassAPIServiceImpl implements StormGlassAPIService {

  //private static final Logger LOGGER = new LoggerFactory.getLogger(StormGlassAPIServiceImpl.class);

  private static final String TOKEN = System.getenv("API_KEY");


  @Override
  public Call<List<ForecastData>> getForecastData(String coordinates) {
    return null;
  }
}
