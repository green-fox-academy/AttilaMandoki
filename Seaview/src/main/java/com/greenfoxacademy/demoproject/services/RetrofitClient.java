package com.greenfoxacademy.demoproject.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

@Service
public class RetrofitClient {

  private final StormGlassAPIService stormGlassAPIService;

  @Autowired
  public RetrofitClient(StormGlassAPIService stormGlassAPIService) {
    this.stormGlassAPIService = stormGlassAPIService;
  }

  private static final String STORM_GLASS_URL = "https://api.stormglass.io/";

  public static Retrofit getConnection(String connectionUrl) {

    Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    return new Retrofit.Builder()
            .baseUrl(connectionUrl)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(new OkHttpClient
                    .Builder()
                    .readTimeout(120, TimeUnit.SECONDS)
                    .connectTimeout(120, TimeUnit.SECONDS)
                    .build())
            .build();
  }

  public static StormGlassAPIService getStormGlassApi() {
    return getConnection(STORM_GLASS_URL).create(StormGlassAPIService.class);
  }

}
