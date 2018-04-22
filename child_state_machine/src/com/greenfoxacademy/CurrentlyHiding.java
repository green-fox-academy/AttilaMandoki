package com.greenfoxacademy;

public class CurrentlyHiding implements ToddlerState {

  ToddlerMachine toddlerMachine;

  public CurrentlyHiding(ToddlerMachine newToddlerMachine) {
    toddlerMachine = newToddlerMachine;
  }

  @Override
  public void callToPlay() {
    toddlerMachine.setToddlerState(toddlerMachine.currentlyPlaying);
    System.out.println("Toddler went from hiding, to playing.");
  }

  @Override
  public void callToEat() {
    toddlerMachine.setToddlerState(toddlerMachine.currentlyHiding);
    System.out.println("Could not convince toddler with food.");
  }

  @Override
  public void callToKindergarten() {
    toddlerMachine.setToddlerState(toddlerMachine.currentlyHiding);
    System.out.println("Toddler just won't stop hiding.");
  }
}
