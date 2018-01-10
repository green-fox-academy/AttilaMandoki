package com.greenfoxacademy.bank_of_simba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnjoyYourselfWebController {
  @RequestMapping("/enjoy")
  public String accountController(Model model) {
    model.addAttribute("enjoy", "This is an <em>HTML</em> text. " +
            "<b>Enjoy yourself!</b>");
    return "EnjoyYourself";
  }
}
