package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import com.greenfoxacademy.programmerfoxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

  FoxService foxService;

  @Autowired
  public LoginController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/login")
  public String showLogin(Model model) {
    model.addAttribute("user", new Fox());
    return "login";
  }

  @PostMapping("/login")
  private ModelAndView handleLogin(Model model, @ModelAttribute Fox fox) {
    Fox loggedInUser = foxService.login(fox);
    model.addAttribute("user", loggedInUser);
    return new ModelAndView("redirect:/users/" + fox.getName());
  }
}
