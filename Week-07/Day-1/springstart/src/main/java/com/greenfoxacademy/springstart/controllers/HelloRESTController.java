package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {


  @GetMapping("/greeting")
  public Greeting sayHi(Model model, @RequestParam(value = "content", required = false) String content) {
    if (content == null) {
      content = "You suck!";
    }
    model.addAttribute("content", content);
    Greeting greeting = new Greeting(1, content);
    return greeting;
  }
}

