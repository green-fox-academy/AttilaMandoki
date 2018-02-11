package com.greenfoxacademy.practice_cognitive_apprenticeship.controllers;

import com.greenfoxacademy.practice_cognitive_apprenticeship.Services.CatService;
import com.greenfoxacademy.practice_cognitive_apprenticeship.Services.OwnerService;
import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetShopRestController {

  @Autowired
  CatService catService;

  @Autowired
  OwnerService ownerService;

  @RequestMapping(value = "/api/petshops", method = RequestMethod.GET)
  public List<Cat> soldCats() {
    return catService.findAll();
  }

  @GetMapping("/api/search/{breed}")
  public Object getCatsBySameBreed(@PathVariable String breed) {
    if (breed == null) {
      return "No brand name provided.";
    } else {
      List<Cat> catsByBreed = catService.catsByBreed(breed);
      return catsByBreed;
    }
  }
  //@PostMapping("/api/newfoster/{name}")
}


