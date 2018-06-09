package com.greenfoxacademy.demoproject.services;

import com.greenfoxacademy.demoproject.models.ForecastData;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

import java.util.List;

@Service
public interface StormGlassAPIService {

  //data is to be replaced
  @Headers({"Content-Type: application/json", "Accept: application/json"})
  @GET("data/{data}")
  Call<List<ForecastData>> getForecastData(@Path("") String data);
}
