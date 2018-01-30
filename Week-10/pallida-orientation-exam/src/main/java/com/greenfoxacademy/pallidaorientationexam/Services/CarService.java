package com.greenfoxacademy.pallidaorientationexam.Services;

import com.greenfoxacademy.pallidaorientationexam.Models.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {

  List<Car> findAll();
  List<Car> findByPlate(String search);
  List<Car> findByBrand(String search);
  List<Car> findIfContains(String search);
}
