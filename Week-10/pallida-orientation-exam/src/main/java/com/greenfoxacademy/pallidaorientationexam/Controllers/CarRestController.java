package com.greenfoxacademy.pallidaorientationexam.Controllers;

import com.greenfoxacademy.pallidaorientationexam.Models.CarList;
import com.greenfoxacademy.pallidaorientationexam.Models.ResponseMessage;
import com.greenfoxacademy.pallidaorientationexam.Services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarRestController {

  @Autowired
  CarService carService;

  @GetMapping("/api/search/{brand}")
  public Object listCarsByBrand(@PathVariable String brand) {
    CarList carList = new CarList();
    if (brand == null) {
      return new ResponseMessage("Please provide car brand.");
    } else {
      carList.setData(carService.findByBrand(brand));
      carList.setResult("ok");
      return carList;
    }
  }
}
