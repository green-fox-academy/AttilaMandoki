package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong idCounter = new AtomicLong();

  @GetMapping("/greeting")
  public Greeting sayHi(Model model, @RequestParam(value = "content", required = false) String content) {
    idCounter.incrementAndGet();
    if (content == null) {
      content = "You suck!";
    }
    model.addAttribute("content", content);
    Greeting greeting = new Greeting(idCounter, content);
    return greeting;
  }
}

