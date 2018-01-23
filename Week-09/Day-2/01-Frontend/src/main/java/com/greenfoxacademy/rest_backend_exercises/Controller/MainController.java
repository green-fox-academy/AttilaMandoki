package com.greenfoxacademy.rest_backend_exercises.Controller;

import com.greenfoxacademy.rest_backend_exercises.Model.Doubling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @Autowired
  Doubling instance;

  @GetMapping(value = "/doubling")
  public Doubling returnInput(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      return new Doubling(input);
    } else {
      return null;
    }
  }
}