package com.greenfoxacademy.rest_backend_exercises.Service;

import com.greenfoxacademy.rest_backend_exercises.Model.GetResponseModel;
import org.springframework.stereotype.Service;

@Service
public class GetResponseService {

  public GetResponseModel sendResultDoubling(String myInput) {
    GetResponseModel getResponseModel = new GetResponseModel();
    return getResponseModel;
  }
}
