package com.greenfoxacademy.pallidaorientationexam.Models;

import javax.persistence.*;

@Entity
@Table(name = "licence_plates")
public class Car {

  @Id
  private String plate;
  private String brand;
  private String model;
  private String color;
  private int year;

  public Car() {
  }

  public Car(String plate, String brand, String model, String color, int year) {
    this.plate = plate;
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.year = year;
  }

  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}
