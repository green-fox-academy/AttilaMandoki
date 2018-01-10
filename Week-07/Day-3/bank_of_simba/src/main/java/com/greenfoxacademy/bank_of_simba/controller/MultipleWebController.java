package com.greenfoxacademy.bank_of_simba.controller;

import com.greenfoxacademy.bank_of_simba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MultipleWebController {
  @RequestMapping(value = "/multiple")
  public String multipleAccount(Model model) {
    List<BankAccount> animals = new ArrayList<>();
    BankAccount accountOfScar = new BankAccount("Scar", 500, "lion");
    BankAccount accountOfPumba = new BankAccount("Pumba", 200, "warthog");
    BankAccount accountOfZazu = new BankAccount("Zazu", 400, "toucan");
    BankAccount accountOfNala = new BankAccount("Nala", 300, "lion");
    BankAccount accountOfTimon = new BankAccount("Timon", 150, "meerkat");

    animals.add(accountOfScar);
    animals.add(accountOfPumba);
    animals.add(accountOfZazu);
    animals.add(accountOfNala);
    animals.add(accountOfTimon);
    model.addAttribute("animals", animals);
    return "MultipleAccounts";
  }
}
