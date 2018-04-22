package com.greenfoxacademy;

public class CurrentlyPlaying implements ToddlerState {

  ToddlerMachine toddlerMachine;

  public CurrentlyPlaying(ToddlerMachine newToddlerMachine) {
    toddlerMachine = newToddlerMachine;
  }

  @Override
  public void callToPlay() {
    System.out.println("Toddler is already playing.");
  }

  @Override
  public void callToEat() {
    toddlerMachine.setToddlerState(toddlerMachine.currentlyEating);
    System.out.println("Toddler went from playing, to eating.");
  }

  @Override
  public void callToKindergarten() {
    toddlerMachine.setToddlerState(toddlerMachine.currentlyHiding);
    System.out.println("Toddler went from playing, to hiding.");
  }

}
