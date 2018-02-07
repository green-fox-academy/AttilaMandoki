package com.greenfoxacademy.practice_cognitive_apprenticeship.controllers;

import com.greenfoxacademy.practice_cognitive_apprenticeship.Services.CatService;
import com.greenfoxacademy.practice_cognitive_apprenticeship.Services.OwnerService;
import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PetShopWebController {

  @Autowired
  CatService catService;

  @Autowired
  OwnerService ownerService;

  @RequestMapping(value = "/petshop", method = RequestMethod.GET)
  public String soldCatsList(Model model) {
    model.addAttribute("cats", catService.findAll());
    return "petshop";
  }
}
