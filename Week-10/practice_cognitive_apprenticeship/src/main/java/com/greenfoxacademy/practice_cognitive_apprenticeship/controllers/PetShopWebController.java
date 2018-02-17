package com.greenfoxacademy.practice_cognitive_apprenticeship.controllers;

import com.greenfoxacademy.practice_cognitive_apprenticeship.Services.CatService;
import com.greenfoxacademy.practice_cognitive_apprenticeship.Services.OwnerService;
import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Cat;
import com.greenfoxacademy.practice_cognitive_apprenticeship.models.CatDTO;
import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Owner;
import com.greenfoxacademy.practice_cognitive_apprenticeship.models.OwnerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PetShopWebController {

  @Autowired
  CatService catService;

  @Autowired
  OwnerService ownerService;

  @GetMapping({"/", "/list"})
  public String adoptedCatsList(Model model) {
    List<Owner> owners = ownerService.findAll();
    model.addAttribute("cats", catService.findAll());
    model.addAttribute("catDTO", new CatDTO());
    model.addAttribute("owners", owners);
    return "catfosters";
  }

  @RequestMapping(value = "/", method = RequestMethod.POST)
  public String newCatAdoption(@ModelAttribute CatDTO catDTO) {
    Cat cat = new Cat();
    cat.setName(catDTO.getName());
    cat.setBreed(catDTO.getBreed());
    Owner currentOwner = ownerService.findByOwnerName(catDTO.getOwner());
    cat.setOwner(currentOwner);
    catService.saveNewCat(cat);
    return "redirect:/";
  }

  @RequestMapping(value = "newfoster", method = RequestMethod.GET)
  public String submitPageForNewOwner(Model model) {
    model.addAttribute("ownerDTO", new OwnerDTO());
    return "newfoster";
  }

  @PostMapping(value = "newfoster")
  public String saveNewOwner(@ModelAttribute OwnerDTO ownerDTO) {
    ownerService.saveNewOwner(ownerDTO.getName());
    return "redirect:/";
  }

  @GetMapping(value = "/search")
  public String search(@RequestParam(value = "search", required = false) String search, Model model) {
    List<Cat> findAllByCatNameContains = catService.findByNameContaining(search);
    List<Owner> owners = new ArrayList<>(ownerService.findAll());
    model.addAttribute("cats", findAllByCatNameContains);
    model.addAttribute("catDTO", new CatDTO());
    model.addAttribute("owners", owners);
    return "catfosters";
  }

  @PostMapping("/delete/{id}")
  public ModelAndView delete(@PathVariable Long id) {
    catService.deleteCat(id);
    return new ModelAndView("redirect:/catfosters/list");
  }
}
