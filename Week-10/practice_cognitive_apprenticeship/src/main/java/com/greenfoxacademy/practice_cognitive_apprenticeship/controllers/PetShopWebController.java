package com.greenfoxacademy.practice_cognitive_apprenticeship.controllers;

import com.greenfoxacademy.practice_cognitive_apprenticeship.Services.CatService;
import com.greenfoxacademy.practice_cognitive_apprenticeship.Services.OwnerService;
import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Cat;
import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PetShopWebController {

  @Autowired
  CatService catService;

  @Autowired
  OwnerService ownerService;

  @RequestMapping(value = "/catfosters", method = RequestMethod.GET)
  public String adoptedCatsList(Model model) {
    model.addAttribute("cats", catService.findAll());
    model.addAttribute("kitten", new Cat());
    return "catfosters";
  }

  @RequestMapping(value = "/catfosters", method = RequestMethod.POST)
  public String newCatAdoption(@ModelAttribute Cat kitten, Model model) {
    model.addAttribute("name", kitten.getName());
    model.addAttribute("breed", kitten.getBreed());
    model.addAttribute("owner", kitten.getOwner());
    List<Owner> owners = new ArrayList<>();
    catService.saveNewCat(kitten);
    return "catfosters";
  }

  @RequestMapping(value = "/newfoster", method = RequestMethod.POST)
  public String submitNewOwner(@ModelAttribute Owner owner, Model model) {
    model.addAttribute("owner_name", owner.getOwnerName());
    ownerService.saveNewOwner(owner);
    return "redirect:/catfosters";
  }
}
