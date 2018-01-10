package com.greenfoxacademy.bank_of_simba.model;

public class BankAccount {

  private String name;
  private long balance;
  private String animalType;
  private boolean isKing;

  public BankAccount() {
  }

  public BankAccount(String name, long balance, String animalType, boolean isKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
  }

  public boolean isKing() {
    return isKing;
  }

  public String getName() {
    return name;
  }

  public long getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }
}
