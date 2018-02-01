package com.greenfoxacademy.pallidaorientationexamretake.models;

public class Cart {

  private String itemName;
  private String itemSize;
  private int quantity;

  public Cart() {
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getItemSize() {
    return itemSize;
  }

  public void setItemSize(String itemSize) {
    this.itemSize = itemSize;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public Cart(String itemName, String itemSize, int quantity) {

    this.itemName = itemName;
    this.itemSize = itemSize;
    this.quantity = quantity;
  }
}
