package com.greenfoxacademy.practice_cognitive_apprenticeship.controllers;

import com.greenfoxacademy.practice_cognitive_apprenticeship.Services.CatService;
import com.greenfoxacademy.practice_cognitive_apprenticeship.Services.OwnerService;
import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Cat;
import com.greenfoxacademy.practice_cognitive_apprenticeship.models.CatDTO;
import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Owner;
import com.greenfoxacademy.practice_cognitive_apprenticeship.models.OwnerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
    List<Owner> owners = new ArrayList<>(ownerService.findAll());
    model.addAttribute("cats", catService.findAll());
    model.addAttribute("catDTO", new CatDTO());
    model.addAttribute("owners", owners);
    return "catfosters";
  }

  @RequestMapping(value = "/catfosters", method = RequestMethod.POST)
  public String newCatAdoption(@ModelAttribute CatDTO catDTO) {
    Cat cat = new Cat();
    cat.setName(catDTO.getName());
    cat.setBreed(catDTO.getBreed());
    Owner currentOwner = ownerService.findByOwnerName(catDTO.getOwner());
    cat.setOwner(currentOwner);
    catService.saveNewCat(cat);
    return "redirect:/catfosters";
  }

  @RequestMapping(value = "/newfoster", method = RequestMethod.GET)
  public String submitPageForNewOwner(Model model) {
    model.addAttribute("ownerDTO", new OwnerDTO());
    return "newfoster";
  }

  @PostMapping(value = "newfoster")
  public String saveNewOwner(@ModelAttribute OwnerDTO ownerDTO) {
    ownerService.saveNewOwner(ownerDTO.getName());
    return "redirect:/catfosters";
  }
}
