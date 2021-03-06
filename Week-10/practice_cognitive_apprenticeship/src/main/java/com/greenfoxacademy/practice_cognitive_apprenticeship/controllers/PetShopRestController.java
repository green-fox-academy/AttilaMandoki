package com.greenfoxacademy.practice_cognitive_apprenticeship.controllers;

import com.greenfoxacademy.practice_cognitive_apprenticeship.Services.CatService;
import com.greenfoxacademy.practice_cognitive_apprenticeship.Services.OwnerService;
import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Cat;
import com.greenfoxacademy.practice_cognitive_apprenticeship.models.Owner;
import com.greenfoxacademy.practice_cognitive_apprenticeship.repositories.CatRepository;
import com.greenfoxacademy.practice_cognitive_apprenticeship.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetShopRestController {

  @Autowired
  CatService catService;

  @Autowired
  OwnerService ownerService;

  @Autowired
  OwnerRepository ownerRepository;

  @Autowired
  CatRepository catRepository;

  @RequestMapping(value = "/api/petshops", method = RequestMethod.GET)
  public List<Cat> soldCats() {
    return catService.findAll();
  }

  @GetMapping("/api/search/{breed}")
  public Object getCatsBySameBreed(@PathVariable String breed) {
    if (breed == null) {
      return "No brand name provided.";
    } else {
      return catService.catsByBreed(breed);
      }
    }

  @PostMapping("/api/newfoster/{name}")
  public void newOwner(@PathVariable String name) {
    Owner owner1 = new Owner();
    owner1.setOwnerName(name);
    ownerRepository.save(owner1);
  }

  @PostMapping("/api/newcat/{catname}/{catbreed}")
  public void submitNewCat(@PathVariable String catname, String catbreed) {
    Cat cat1 = new Cat();
    cat1.setName(catname);
    cat1.setBreed(catbreed);
    catRepository.save(cat1);
    //TODO: It's is not working like this, needs to be fixed.
  }

  @PostMapping("/api/newjsoncat")
  public ResponseEntity<Cat> newCatFromJsonFormat(@RequestBody Cat cat) {
    return new ResponseEntity<>(cat, HttpStatus.OK);
  }
}


