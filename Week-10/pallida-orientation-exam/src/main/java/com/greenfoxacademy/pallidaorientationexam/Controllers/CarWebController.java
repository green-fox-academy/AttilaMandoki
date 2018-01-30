package com.greenfoxacademy.pallidaorientationexam.Controllers;

import com.greenfoxacademy.pallidaorientationexam.Models.Car;
import com.greenfoxacademy.pallidaorientationexam.Models.CarList;
import com.greenfoxacademy.pallidaorientationexam.Models.ResponseMessage;
import com.greenfoxacademy.pallidaorientationexam.Repositories.CarRepository;
import com.greenfoxacademy.pallidaorientationexam.Services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarWebController {

  @Autowired
  CarRepository carRepository;

  @Autowired
  CarService carService;

  @GetMapping(value = {"/", ""})
  public String displayWholeList(Model model) {
    List<Car> listOfCars = (List<Car>) carRepository.findAll();
    model.addAttribute("carList", listOfCars);
    return "licence-plate";
  }

  @GetMapping(value = "/police")
  public String onlyPolice(Model model) {
    List<Car> police;
    police = carRepository.findAllByPlateStartingWithIgnoreCase("RB");
    model.addAttribute("carList", police);
    return "licence-plate";
  }

  @GetMapping(value = "/diplomats")
  public String onlyDiplomats(Model model) {
    List<Car> diplomats;
    diplomats = carRepository.findAllByPlateStartingWithIgnoreCase("DT");
    model.addAttribute("carList", diplomats);
    return "licence-plate";
  }

  @GetMapping("/search")
  public String search(@RequestParam(value = "search", required = false) String search, Model model) {
    List<Car> findIfContains = carService.findIfContains(search);
    model.addAttribute("carList", findIfContains);
    return "licence-plate";
  }

  @GetMapping(value = "/search/{brand}")
  public String brandGroups(@PathVariable String brand, Model model) {
  List<Car> carList = carService.findByBrand(brand);
  model.addAttribute("carList", carList);
  return "licence-plate";
  }
}
