package com.greenfoxacademy.pallidaorientationexam.Services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class InputEvaluation {

  private List<Character> allowedFormat;

  public InputEvaluation() {
    this.allowedFormat = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
  }
}
