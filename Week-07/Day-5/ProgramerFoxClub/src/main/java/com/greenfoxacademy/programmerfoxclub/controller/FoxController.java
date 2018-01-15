package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FoxController {

  @Autowired
  Fox fox;

  @RequestMapping(value = "/")

  public String loadMain(Model model) {
    model.addAttribute("Fox", fox);
    return "index";
  }
}