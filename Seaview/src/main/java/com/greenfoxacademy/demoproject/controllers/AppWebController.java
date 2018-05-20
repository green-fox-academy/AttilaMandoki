package com.greenfoxacademy.demoproject.controllers;

import com.greenfoxacademy.demoproject.models.Coordinates;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppWebController {

  @RequestMapping(value = "/stormglasscall", method = RequestMethod.GET)
  public String submitCoordinates(Model model) {
    model.addAttribute("coordinates", new Coordinates());
    return "/";
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String mainPage(Model model) {
    return null;
  }
}
