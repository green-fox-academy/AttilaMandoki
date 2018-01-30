package com.greenfoxacademy.pallidaorientationexam.Repositories;

import com.greenfoxacademy.pallidaorientationexam.Models.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

  List<Car> findAllByBrand(String search);
  List<Car> findAllByPlateStartingWithIgnoreCase(String search);
  List<Car> findAllByPlateContainingIgnoreCase(String search);
}
