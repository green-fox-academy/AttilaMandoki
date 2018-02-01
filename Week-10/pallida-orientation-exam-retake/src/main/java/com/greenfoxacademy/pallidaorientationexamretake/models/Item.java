package com.greenfoxacademy.pallidaorientationexamretake.models;

import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;

@Entity
@Table(name = "warehouse")
public class Item {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(name = "item_name")
  private String item;
  private String manufacturer;
  private String category;
  private String size;
  @Column(name = "unit_price")
  private long price;

  public Item() {
  }

  public Item(String item, String manufacturer, String category, String size, long price) {
    this.item = item;
    this.manufacturer = manufacturer;
    this.category = category;
    this.size = size;
    this.price = price;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }
}
