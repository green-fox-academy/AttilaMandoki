package com.greenfoxacademy;

public class ToddlerMachine {

  ToddlerState currentlyPlaying;
  ToddlerState currentlyEating;
  ToddlerState currentlyHiding;

  ToddlerState toddlerState;

  public ToddlerMachine() {
    this.toddlerState = new CurrentlyPlaying(this);
  }

  public ToddlerMachine(ToddlerState toddlerState) {
    this.toddlerState = toddlerState;

    //toddlerState = currentlyPlaying;
  }

  public void callToEat() {
    toddlerState.callToEat();
  }

  public void callToPlay() {
    toddlerState.callToPlay();
  }

  public void callToKindergarten() {
    toddlerState.callToKindergarten();
  }

}
