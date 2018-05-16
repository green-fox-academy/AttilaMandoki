package com.greenfoxacademy.demoproject.services;

import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class RetrofitService {

  public static Retrofit retrofitCreate() {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.stormglass.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    return retrofit;
  }

}
