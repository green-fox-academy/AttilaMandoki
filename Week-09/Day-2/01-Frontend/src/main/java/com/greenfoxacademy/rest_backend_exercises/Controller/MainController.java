package com.greenfoxacademy.rest_backend_exercises.Controller;

import com.greenfoxacademy.rest_backend_exercises.Model.AppendA;
import com.greenfoxacademy.rest_backend_exercises.Model.DoUntil.DoUntilSum;
import com.greenfoxacademy.rest_backend_exercises.Model.Doubling;
import com.greenfoxacademy.rest_backend_exercises.Model.Message.ErrorMessage;
import com.greenfoxacademy.rest_backend_exercises.Model.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping(value = "/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new ErrorMessage("Please provide a name!");
    } else if (title == null) {
      return new ErrorMessage("Please provide a title!");
    } else {
      return new Greeter(name, title);
    }
  }

  @GetMapping(value = "/appenda/{appendable}")
  public Object appendA(@PathVariable("appendable") String appendable) {
    if (appendable != null) {
      return new AppendA();
    } else {
      return new ErrorMessage("Please enter a word!");
    }
  }

  @PostMapping(value = "/dountil/{what}")
  public DoUntilSum doUntil()
}
