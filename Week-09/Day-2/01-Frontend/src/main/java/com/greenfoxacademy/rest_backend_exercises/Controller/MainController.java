package com.greenfoxacademy.rest_backend_exercises.Controller;

import com.greenfoxacademy.rest_backend_exercises.Model.Doubling;
import com.greenfoxacademy.rest_backend_exercises.Model.ErrorMessage;
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

  @GetMapping(value = "/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new ErrorMessage("Please provide a name!");
    } else if (title == null) {
      return new ErrorMessage("Please provide a title!");
    } else {
      return greeter(name, title);
    }
  }
}
