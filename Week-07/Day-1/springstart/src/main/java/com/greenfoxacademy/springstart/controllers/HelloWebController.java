package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong idCounter = new AtomicLong();

  @RequestMapping(value = "/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name", required = false) String content) {
    model.addAttribute("name", content);
    model.addAttribute("loadTime", idCounter.incrementAndGet());
    return "greeting";
  }
}
