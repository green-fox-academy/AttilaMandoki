package com.greenfoxacademy;

public interface ToddlerState {

  void callToPlay(CurrentlyPlaying currentlyPlaying);

  void callToEat(CurrentlyEating currentlyEating);

  void callToKindergarten(CurrentlyHiding currentlyHiding);
}
