package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {


  @RequestMapping
  public Greeting sayHi() {
    Greeting greeting = new Greeting();
    return greeting;
  }
}
