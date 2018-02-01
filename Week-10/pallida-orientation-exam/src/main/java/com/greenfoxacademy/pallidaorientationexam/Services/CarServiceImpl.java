package com.greenfoxacademy.pallidaorientationexam.Services;

import com.greenfoxacademy.pallidaorientationexam.Models.Car;
import com.greenfoxacademy.pallidaorientationexam.Repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

  @Autowired
  CarRepository carRepository;

  @Override
  public List<Car> findAll() {
    return (List<Car>) carRepository.findAll();
  }

//  @Override
//  public List<Car> findByPlate(String plate) {
//    return carRepository.findAllByPlateStartingWithIgnoreCase(plate);
//  }

  @Override
  public List<Car> findByBrand(String brand) {
    return carRepository.findAllByBrand(brand);
  }

  @Override
  public List<Car> findIfContains(String search) {
    return (List<Car>) carRepository.findAllByPlateContainingIgnoreCase(search);
  }
}
