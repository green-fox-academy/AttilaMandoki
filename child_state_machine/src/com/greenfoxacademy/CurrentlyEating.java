package com.greenfoxacademy;

public class CurrentlyEating implements ToddlerState {

  ToddlerMachine toddlerMachine;

  /*public CurrentlyEating(ToddlerMachine newToddlerMachine) {
    toddlerMachine = newToddlerMachine;
  }*/

  @Override
  public void callToPlay() {
    toddlerMachine.setToddlerState(toddlerMachine.currentlyPlaying);
    System.out.println("Toddler went from eating, to playing.");
  }

  @Override
  public void callToEat() {
    System.out.println("Toddler is already eating.");
  }

  @Override
  public void callToKindergarten() {
    toddlerMachine.setToddlerState(toddlerMachine.currentlyHiding);
    System.out.println("Toddler went from eating, to hiding.");
  }
}
