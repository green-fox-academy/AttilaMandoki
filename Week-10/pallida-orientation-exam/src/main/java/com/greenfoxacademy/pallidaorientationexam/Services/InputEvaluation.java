package com.greenfoxacademy.pallidaorientationexam.Services;

import com.greenfoxacademy.pallidaorientationexam.Models.Car;
import com.greenfoxacademy.pallidaorientationexam.Models.ResponseMessage;
import com.greenfoxacademy.pallidaorientationexam.Repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class InputEvaluation {

  @Autowired
  CarRepository carRepository;

  @Autowired
  CarService carService;

  private List<Character> allowedFormat;

  public InputEvaluation() {
    this.allowedFormat = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
  }

  public boolean inputValidator(String inputLicencePlate) {
    if (inputLicencePlate.length() <= 7 && carRepository.findAllByPlateContainingIgnoreCase(inputLicencePlate) != null) {
      for (int i = 0; i < allowedFormat.size(); i++) {
        if(!allowedFormat.contains(inputLicencePlate.charAt(i))) {
          return false;
        }
      }
    }
    return true;
  }
}
