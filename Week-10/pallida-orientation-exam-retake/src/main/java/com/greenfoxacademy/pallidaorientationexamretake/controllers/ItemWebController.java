package com.greenfoxacademy.pallidaorientationexamretake.controllers;

import com.greenfoxacademy.pallidaorientationexamretake.models.Cart;
import com.greenfoxacademy.pallidaorientationexamretake.models.Item;
import com.greenfoxacademy.pallidaorientationexamretake.services.ItemService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemWebController {

  @Autowired
  ItemService itemService;

  private Cart shoppingCart;

  @GetMapping(value = "/webshop")
  public String shoppingPlanner(@ModelAttribute Cart cart, Model model) {
    model.addAttribute("items", itemService.findAll());
    model.addAttribute("cart", new Cart());
    model.addAttribute("distinctItem", itemService.findAllDistinctName());
    model.addAttribute("distinctSize", itemService.findAllDistinctSize());
    return "webshop";
  }

  @PostMapping(value = "/webshop/summary")
  public String placeInCart( Model model) {
    
    return "summary";
  }
}