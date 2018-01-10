package com.greenfoxacademy.bank_of_simba.controller;

import com.greenfoxacademy.bank_of_simba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankWebController {

  @RequestMapping(value = "/show")
  public String simbasAccount(Model model) {
    BankAccount accountOfSimba = new BankAccount("Simba", 200, "lion");
    model.addAttribute("name", accountOfSimba.getName());
    model.addAttribute("balance", accountOfSimba.getBalance());
    model.addAttribute("animalType", accountOfSimba.getAnimalType());
    return "BankAccount";
  }
}
